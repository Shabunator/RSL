import React from "react";
import './header.css';

import { Link } from "react-router-dom";

const Header = ({name}) => {



    return (
        <div className='header'>

            <div className='left-header'>
                <Link to='/'>Мои резюме</Link>
            </div>

            <div className='right-block'>

                <div>
                    <Link to='/new-resume'>Создать резюме</Link>
                </div>

                <div>
                    Вадим Павлович Волга
                </div>

             </div>

        </div>
    );
};

export default Header;