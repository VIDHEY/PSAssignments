import React from 'react';
import ShopItem from './ShopItem'
import '../../App.css';

class ShopItemSet extends React.Component {
    render() {
        return (
            <div className="col-md-9">
            {
                this.props.cloths.map((cloth) => <ShopItem clothName={cloth.clothName} price={cloth.price} imgSrc={cloth.imgSrc}/>)
            }
            </div>
        );
    }
}

export default ShopItemSet;

