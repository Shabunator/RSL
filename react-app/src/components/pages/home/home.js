import React from "react";
import ResumeList from "../../resume-list";

const Home = () => {

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
        return list;

    }

    return (
        <div className='home'>

            <h1>Home</h1>

            <ResumeList getData = {getData}/>

        </div>
    );
};

export default Home;
