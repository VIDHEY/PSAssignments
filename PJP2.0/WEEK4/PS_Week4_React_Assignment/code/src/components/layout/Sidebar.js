import React from 'react';
import '../../App.css';
import Subcategories from './Subcategories'
import Filter from './Filter'

class Sidebar extends React.Component {
    render() {
        return (
           <div className="col-md-3">
            <Subcategories/>
            <Filter/>
           </div>
        );
    }
}

export default Sidebar;
