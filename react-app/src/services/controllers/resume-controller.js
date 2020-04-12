import Service from "../service";

export default class ResumeController extends Service {

    RESUME_URL = "resume/";

    /** CRUD: ---------------------------------------------------------------------- */

    getResumeList = async () => {
        const response = await this.GET(this.RESUME_URL);
        return this.promise(response);
    };

}