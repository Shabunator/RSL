import React from "react";
import { AppConsumer } from "../app-context";

const withService = (mapMethodsToProps) => (Wrapped) => {

    return (props) => {
        return (
            <AppConsumer>
                {
                    (services) => {
                        let serviceProps = null;

                        if (mapMethodsToProps) serviceProps = mapMethodsToProps(services);

                        return (
                            <Wrapped {...props} {...serviceProps} services={services}/>
                        );
                    }
                }
            </AppConsumer>
        );
    }
};

export default withService;