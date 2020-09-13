import React from 'react';
import '../../App.css';

class ShopItem extends React.Component {
    render() {
        const {imgSrc,clothName,price} = this.props;
        return (
            <div className="card col-md-4 col-sm-4">
                <img className="card-img-top" src={require('../../img/' + imgSrc )} alt="" style={{width: 200}}/>
                <div className="card-body">
                    <h4 className="card-title">{clothName}</h4>
                    <p className="card-text">{price}</p>
                    <a href="./" className="btn btn-primary stretched-link">Buy</a>
                </div>
            </div>
        );
    }
}
export default ShopItem;

