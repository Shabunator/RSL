import React, {Component} from "react";
import './input-block.css';
import ClearSvg from "./clear-svg";

class InputBlock extends Component {

    state = {
        value: ''
    };

    render() {
        const {
            clearButtonColor = "black",
            label
        } = this.props;

        const {value} = this.state;

        return (
            <div className='block-with-label'>
                <div>{label}</div>

                <div className='input-block-wrapper'>

                    <input
                        className='input-block'
                        value={value}
                        placeholder={"Введите текст"}

                        onChange={this.onChange}
                    />

                    <button
                        className={`input-button clear-button ${ value ? '' : 'nothing-to-clear'}`}
                        onClick={this.onClearButtonClick}
                    >
                        <ClearSvg color={clearButtonColor}/>

                    </button>

                </div>
            </div>
        );
    }

    onChange = (e) => {
        e.stopPropagation();
        this.setState({value: e.target.value});
    };

    onClearButtonClick = (e) => {
        e.stopPropagation();
        this.setState({value: ''});
    };


}

export default InputBlock;