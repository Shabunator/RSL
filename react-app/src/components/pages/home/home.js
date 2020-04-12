import React from "react";
import withService from "../../../additional-components/hoc/withService";
import InputBlock from "../../input-block";

class Home extends React.Component {

    state = {
        resume: null,
        // contactDetails: null,
        // basicInformation: null,
        // specialty: null,
        // workExperience: null,
        // educationList: null,
        // nativeLanguage: null,
        // foreignLanguageList: null,
        // otherImportantInformation: null,
    };
    componentDidMount() {
        this.props.resumeController.getResumeList()
            .then(body => {
                console.log(body)
                this.setState({resume: body[0]})

            })
            .catch(err => {
                console.log(err)
            });
    }

    render() {
        const {resume} = this.state;

        if (!resume)
            return <div>Loading</div>

        if (!resume.contactDetails)
            return <div>Loading</div>
        return (
            <div className='home'>

                <h2>Контактные данные</h2>

                <InputBlock
                    label={"Имя"}
                    defaultValue={resume.contactDetails.firstName}
                />

                <InputBlock
                    label={"фамилия"}
                    defaultValue={resume.contactDetails.lastName}
                />

                <InputBlock
                    label={"город проживания"}
                    defaultValue={resume.contactDetails.residenceCity}
                />

                <h2>Основная информация</h2>

                <InputBlock
                    label={"дата рождения"}
                    defaultValue={resume.basicInformation.birthDate}
                />

                <InputBlock
                    label={"пол"}
                    defaultValue={resume.basicInformation.gender}
                />

                <InputBlock
                    label={"гражданство"}
                    defaultValue={resume.basicInformation.nationality}
                />

                <InputBlock
                    label={"опыт работы"}
                    defaultValue={resume.basicInformation.workExperience}
                />

                <h2>Специальность</h2>

                <InputBlock
                    label={"желаемая должность"}
                    defaultValue={resume.specialty.desiredPosition}
                />

                <InputBlock
                    label={"зарплата"}
                    defaultValue={resume.specialty.salary}
                />

                <InputBlock
                    label={"профессиональная область"}
                    defaultValue={resume.specialty.professionalArea}
                />

                <h2>Опыт работы</h2>

                <InputBlock
                    label={"места работы"}
                    defaultValue={resume.workExperience.workPlaceList}
                />

                <InputBlock
                    label={"о себе"}
                    defaultValue={resume.workExperience.aboutMe}
                />

                <InputBlock
                    label={"ключевые навыки"}
                    defaultValue={resume.specialty.skills}
                />

                <h2>Образование</h2>

                <InputBlock
                    label={"Уровень"}
                    defaultValue={resume.educationList[0].educationLevel}
                />
                <InputBlock
                    label={"Учебное заведение"}
                    defaultValue={resume.educationList[0].educationalInstitution}
                />
                <InputBlock
                    label={"Факультет"}
                    defaultValue={resume.educationList[0].faculty}
                />
                <InputBlock
                    label={"Год окончания"}
                    defaultValue={resume.educationList[0].endDate}
                />

                <h2>родной язык</h2>
                <p>{resume.nativeLanguage.name}</p>

                <h2>список иностранных языков</h2>
                <p>{resume.foreignLanguageList[0].name}</p>

                <h2>другая важная информация</h2>

                <p>{resume.otherImportantInformation}</p>

            </div>
        );
    }
}

const mapMethodsToProps = ({resumeController}) => {
    return {
        resumeController
    };
};

export default withService(mapMethodsToProps)(Home);