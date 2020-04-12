import React from "react";
import withService from "../../../additional-components/hoc/withService";
import InputBlock from "../../input-block";
import './user.css';

const User = ({userController}) => {

    const user = {
        id: null,
        login: "user1",
        password: "passwordForUser1",
        email: "user1@gmail.com",
        resumeList: [],
    };

    userController.save(user)
        .then(body => {

            console.log(body);

        })
        .catch(err => {

            console.log(err);

        });

    userController.delete(1)
        .then(body => {

            console.log(body);

        })
        .catch(err => {

            console.log(err);

        });

    return (
        <div className='user'>

            <div className='form'>

                <h1>User</h1>

                <InputBlock label={"Имя"}/>

                <InputBlock label={"Фамилия"}/>

                <InputBlock label={"Пароль"}/>

                <InputBlock label={"email"}/>

                <button className='button-save'>Сохранить</button>

            </div>

        </div>
    );
};

const mapMethodsToProps = ({userController}) => {
    return {
        userController,
    };
};

export default withService(mapMethodsToProps)(User);