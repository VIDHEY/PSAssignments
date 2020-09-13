import React from 'react';
import '../../App.css';

class Navbar extends React.Component {
    render() {
        return (
            <nav className="navbar navbar-inverse">
                <div className="container-fluid">
                    <div className="navbar-header">
                        <a className="navbar-brand" href="./">MDB</a>
                    </div>
                    <ul className="nav navbar-nav navbar-right">
                        <li className="active"><a href="./Shop">Shop</a></li>
                        <li><a href="./Contact">Contact</a></li>
                        <li><a href="./signin"><span className="glyphicon glyphicon-user"></span> Sign In</a></li>
                        <li><a href="./signup"><span className="glyphicon glyphicon-log-in"></span> SignUp</a></li>
                    </ul>
                </div>
            </nav>
        );
    }
}

export default Navbar;
