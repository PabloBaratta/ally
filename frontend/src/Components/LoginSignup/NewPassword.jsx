import React, { useState } from 'react';
import './LoginSignup.css'
import {Link} from "react-router-dom";

const NewPassword = () => {

    return (

        <div>
            <h1 className="titulo">Ally</h1>
            <div className='container'>
                <div className='header'>
                    <div className='text'>Restablecer Contraseña</div>
                </div>
                <div className='inputs'>
                    <p className='Email-Contraseña'>Nueva Contraseña</p>
                    <div className='input'>
                        <input type='passwrod'/>
                    </div>

                    <p className='Email-Contraseña'>Confirmar Contraseña</p>
                    <div className='input'>
                        <input type='password'/>
                    </div>
                </div>

                <div className='submit-container'>
                    <Link to={"/"} style={{textDecoration: "none"}}>
                        <button className="submit">Confirmar</button>
                    </Link>
                </div>
            </div>
        </div>

    )

}

export default NewPassword