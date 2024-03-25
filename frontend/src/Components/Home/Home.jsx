import React, { useState } from 'react';
import {Link} from "react-router-dom";

const Home = () => {
    return (
        <div>
            <h1>Home</h1>
            <div>
                <Link to={"/"}>
                    <button>Log out</button>
                </Link>

            </div>

        </div>
    );
}
export default Home