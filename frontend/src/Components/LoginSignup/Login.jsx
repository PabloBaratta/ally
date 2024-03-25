import React, { useState } from 'react';
import './LoginSignup.css'
import {Link} from "react-router-dom";


const Login = () => {

    return (
        <div>
            <h1 className="titulo">Ally</h1>
            <div className='container'>
                <div className='header'>
                    <div className='text'>Iniciar sesion</div>
                </div>
                <div className='inputs'>
                    <p className='Email-Contrase�a'>Email</p>
                    <div className='input'>
                        <input type='email'/>
                    </div>

                    <p className='Email-Contrase�a'>Contrasena</p>
                    <div className='input'>
                        <input type='password'/>
                    </div>
                </div>
            <div className='forgot-password'>
                Restablecer contrasena
            </div>
            <div className='submit-container'>
                <Link to={"/home"} style={{ textDecoration: "none" }}>
                    <button className="submit">Iniciar sesion</button>
                </Link>
                <Link to={"/signup"} style={{ textDecoration: "none" }}>
                    <button className="gray">Crear cuenta</button>
                </Link>
            </div>
        </div>
        </div>
);
}
export default Login