import React, { useState } from 'react';
import './LoginSignup.css'


const LoginSignup = () => {


    const [action, setAction] = useState("Iniciar sesion");
    return (
        <div>
            <h1 className="titulo">Ally</h1>
        <div className='container'>
            <div className='header'>
                <div className='text'>{action}</div>
            </div>
            <div className='inputs'>
                {action === "Iniciar sesion" ? <div></div> : <div><p className='nombre-de-usuario'>Nombre de usuario</p>
                    <div className='input'>
                        <input type='text'/>
                    </div>
                </div>}

                <p className='Email-Contraseña'>Email</p>
                <div className='input'>
                    <input type='email'/>
                </div>

                <p className='Email-Contraseña'>Contrasena</p>
                <div className='input'>
                    <input type='password'/>
                </div>
            </div>
            {action === "Crear cuenta" ? <div></div> : <div className='forgot-password'>Restablecer contrasena</div>}
            <div className='submit-container'>
                <div className={action === "Iniciar sesion" ? "submit gray" : "submit"} onClick={() => {
                    setAction("Crear cuenta")
                }}>Crear cuenta
                </div>
                <div className={action === "Crear cuenta" ? "submit gray" : "submit"} onClick={() => {
                    setAction("Iniciar sesion")
                }}>Iniciar sesion
                </div>
            </div>

        </div>
        </div>
    )
}
export default LoginSignup