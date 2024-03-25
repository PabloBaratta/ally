import './App.css';
import Login from "./Components/LoginSignup/Login";
import SignUp from "./Components/LoginSignup/SignUp";
import Home from "./Components/Home/Home";
import {useNavigate, Routes, Route} from "react-router-dom";

function App() {
    const navigate = useNavigate()
    return (
        <Routes>
            <Route path="/" element={<Login/>}/>
            <Route path="/signup" element={<SignUp/>}/>
            <Route path="/home" element={<Home/>}/>
        </Routes>
    );
}

export default App;
