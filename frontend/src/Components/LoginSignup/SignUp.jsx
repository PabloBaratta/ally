import React, { useState } from 'react';
import './LoginSignup.css'
import {Link} from "react-router-dom";
import axios from 'axios';

const SignUp = () => {

    const [name, setUsername] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');

    const handleSubmit = async (event) => {
        event.preventDefault();

        const userData = {
            name: name,
            email: email,
            password: password

        };

        try {
            const response = await axios.post('http://localhost:8080/user/create', userData);
            if (response.status === 200) {
                console.log('Usuario creado exitosamente');
            } else {
                console.error('Error al crear usuario:', response.data);
            }
        } catch (error) {
            console.error('Error al comunicarse con el servidor:', error);
        }
    };

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
                        <input type='text' value={name} onChange={(e) => setUsername(e.target.value)} />
                    </div>
                </div>

                <p className='Email-Contraseña'>Email</p>
                <div className='input'>
                    <input type='email' value={email} onChange={(e) => setEmail(e.target.value)}/>
                </div>

                <p className='Email-Contraseña'>Contraseña</p>
                <div className='input'>
                    <input type='password' value={password} onChange={(e) => setPassword(e.target.value)} />
                </div>
            </div>
            <div className='submit-container'>
                    <button className="submit" onClick={handleSubmit}>Crear cuenta</button>
                <Link to={"/"} style={{textDecoration: "none"}}>
                    <button className="gray">Iniciar sesión</button>
                </Link>
            </div>
        </div>
    );
}
export default SignUp