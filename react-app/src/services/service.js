import {Type} from "../utils";

export default class  Service {

    BASE_URL = "http://localhost:8080/";

    _GET = "GET";
    _POST = "POST";
    _PUT = "PUT";
    _DELETE = "DELETE";

    FETCH = async ( method, remainingUrlPart, body, headers ) => {

        // Составляемый URL
        const URL = this.BASE_URL + remainingUrlPart;

        // Базовые заголовки и добавляем оставщиеся заголовки, если они есть
        headers = {
            "Content-Type" : "application/json",
            ...headers
        };

        const init = {
            method,
            headers,
        };

        if (body) {
            init.body = Type.isString(body) ? body : JSON.stringify(body);
        }

        const fetchedData = await fetch(URL, init);

        return fetchedData.json();
    };


    async GET ( url, headers) { return this.FETCH (this._GET, url, null, headers) }

    async POST ( url, body, headers ) { return this.FETCH (this._POST, url, body, headers ) }

    async PUT ( url, body, headers )  { return this.FETCH (this._PUT, url, body, headers ) }

    async DELETE ( url, body, headers ) { return this.FETCH (this._DELETE, url, body, headers) }

    /**
     * Возвращаемый пр
     * @param responseомис
     * @returns {Promise<unknown>}
     */
    promise = (response) => new Promise((resolve, reject) => {

        console.log(response);

        if (response) {

            const {status, message, body} = response;

            if (status !== "OK") reject(new Error(message));

            resolve(body);
        }

        reject(new Error("No response..."));
    });
}

