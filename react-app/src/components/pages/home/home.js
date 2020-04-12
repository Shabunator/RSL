import React from "react";
import ResumeList from "../../resume-list";
import withService from "../../../additional-components/hoc/withService";
import service from "../../../services/service";

const Home = ({resumeController}) => {

    const list = [

        {
            id: 1,
            name: "Java developer",
        },

        {
            id: 2,
            name: "React developer",
        },

        {
            id: 3,
            name: "Kotlin developer",
        },

        {
            id: 1,
            name: "C++ developer",
        }

    ];

    const getData = () => {
        resumeController.getResumeList()
            .then((body) => {
                console.log(body)
            })
            .catch((err) => {
                console.log(err)
            })
    };



    return (
        <div className='home'>

            <h1>Home</h1>

            <ResumeList getData = {resumeController.getResumeList}/>
        </div>
    );
};

const mapMethodsToProps = ({resumeController}) => {
    return {
        resumeController
    };
};

export default withService(mapMethodsToProps)(Home);
