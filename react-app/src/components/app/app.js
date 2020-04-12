import React from "react";
import './app.css';
import Home from "../pages/home";

import { Switch, Route } from "react-router-dom";
import Header from "../header";
import NewResume from "../pages/new-resume";
import User from "../pages/user/user";

const App = () => {

    return (
        <div className='app'>

            <Header/>

            <Switch>

                <Route exact path='/' component={Home} />

                <Route exact path='/user' component={User} />

                <Route exact path='/new-resume' component={NewResume} />

            </Switch>

        </div>
    );
};

export default App;