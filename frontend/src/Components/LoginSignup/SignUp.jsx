import React, { useState } from 'react';
import './LoginSignup.css'
import {Link} from "react-router-dom";


const SignUp = () => {
    return (
        <div>
            <h1 className="titulo">Ally</h1>
            <div className='container'>
                <div className='header'>
                    <div className='text'>Crear cuenta</div>
                </div>
                <div className='inputs'>
                    <div>
                        <p className='nombre-de-usuario'>Nombre de usuario</p>
                    </div>
                    <div className='input'>
                        <input type='text'/>
                    </div>
                </div>

                <p className='Email-Contraseña'>Email</p>
                <div className='input'>
                    <input type='email'/>
                </div>

                <p className='Email-Contraseña'>Contraseña</p>
                <div className='input'>
                    <input type='password'/>
                </div>
            </div>
            <div className='submit-container'>
                <Link to={"/"} style={{ textDecoration: "none" }}>
                    <button className="submit">Crear cuenta</button>
                </Link>
                <Link to={"/"} style={{ textDecoration: "none" }}>
                    <button className="gray">Iniciar sesión</button>
                </Link>
            </div>
        </div>
    );
}
export default SignUp