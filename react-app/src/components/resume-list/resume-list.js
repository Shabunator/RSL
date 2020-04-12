import React from "react";
import './resume-list.css';
import withData from "../../additional-components/hoc/withData";

const ResumeList = ({data}) => {


    return (
        <ul>

            {
                data.map((listItem) => {

                    return (
                        <li
                            key={listItem.id}
                        >
                            {listItem.name}
                        </li>
                    );

                })
            }

        </ul>
    );
};

export default withData(ResumeList);