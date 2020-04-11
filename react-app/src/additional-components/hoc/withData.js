import React, {Component} from "react";
import Spinner from "../spinner";
import ErrorBoundary from "../error-boundary";

const withData = (View) => {

    return class extends Component {

        state = {
            data: null,
            loading: true,
            error: false
        };

        update = () => {

            this.setState({
                loading: true,
                error: false
            });

            if(this.props.getData) {
                this.props.getData()
                    .then((data) => this.setState({
                        data,
                        loading: false
                    }))
                    .catch(() => this.setState({
                        error: true,
                        loading: false
                    }));
            }
        };

        render() {
            const {data, loading, error} = this.state;

            if (loading) return <Spinner/>;

            if (error) return <ErrorBoundary/>;

            return <View {...this.props} data={data} />;
        }

        componentDidMount() {
            this.update();
        }

        componentDidUpdate(prevProps, prevState, snapshot) {
            if (this.props.getData !== prevProps.getData) {
                this.update();
            }
        }

    }
};

export default withData;