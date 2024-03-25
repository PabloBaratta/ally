import React, { useState } from 'react';
import {Link} from "react-router-dom";
import './Home.css'

const Home = () => {
    return (
        <div>
            <h1 className='titulo'>Home</h1>
            <div className='submit-container'>
                <Link to={"/"}>
                    <button className='submit'>Log out</button>
                </Link>

            </div>

        </div>
    );
}
export default Home