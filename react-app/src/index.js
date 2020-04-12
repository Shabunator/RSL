import React from "react";
import ReactDOM from "react-dom";
import { BrowserRouter as Router } from "react-router-dom";
import App from "./components/app";
import {AppProvider} from "./additional-components/app-context"
import {ResumeController} from "./services"
import ErrorBoundary from "./additional-components/error-boundary";

const services = {
    resumeController: new ResumeController()
};

ReactDOM.render(

    <ErrorBoundary>
        <AppProvider value={services}>
            <Router>
                <App/>
            </Router>
        </AppProvider>
    </ErrorBoundary>,

    document.getElementById("root")
);