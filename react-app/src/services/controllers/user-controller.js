import Service from "../service";

export default class UserController extends Service {

    USER_URL = "user/";

    save = async (user) => {
        const response = await this.POST(this.USER_URL, user);
        console.log(response);
        return this.promise(response);
    };

    getByLogin = async (login) => {
        const response = await this.GET(this.USER_URL + `login=${login}`);
        console.log(response);
        return this.promise(response);
    };

    addResume = async (userId, resume) => {
        const response = await this.PUT(this.USER_URL + `user=${userId}`, resume);
        console.log(response);
        return this.promise(response);
    };

    deleteResume = async (userId, resume) => {
        const response = await this.PUT(this.USER_URL + `user=${userId}&resume=${resume}`, resume);
        console.log(response);
        return this.promise(response);
    };

    delete = async (userId) => {
        const response = await this.DELETE(this.USER_URL + `user=${userId}`);
        console.log(response);
        return this.promise(response);
    };
}