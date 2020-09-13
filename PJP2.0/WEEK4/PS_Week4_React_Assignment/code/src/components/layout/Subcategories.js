import React from 'react';
import '../../App.css';

class Subcategories extends React.Component {
    render() {
        return (
            <div>
            <h3>Subcategories</h3>
                <ul className="list-group">
                    <li className="list-group-item">Dresses</li>
                    <li className="list-group-item">Tops</li>
                    <li className="list-group-item">Jeans</li>
                    <li className="list-group-item">Sweaters</li>
                </ul>
            </div>
        );
    }
}

export default Subcategories;
