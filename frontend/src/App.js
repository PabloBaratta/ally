import './App.css';
import Login from "./Components/LoginSignup/Login";
import SignUp from "./Components/LoginSignup/SignUp";
import Home from "./Components/Home/Home";
import {useNavigate, Routes, Route} from "react-router-dom";
import NewPassword from "./Components/LoginSignup/NewPassword";

function App() {
    const navigate = useNavigate()
    return (
        <Routes>
            <Route path="/" element={<Login/>}/>
            <Route path="/signup" element={<SignUp/>}/>
            <Route path="/home" element={<Home/>}/>
            <Route path="/newpassword" element={<NewPassword/>}/>
        </Routes>
    );
}

export default App;
