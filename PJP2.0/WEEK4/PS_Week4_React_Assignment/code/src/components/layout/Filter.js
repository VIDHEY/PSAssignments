import React from 'react';
import '../../App.css';

class Filter extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            isGoing: true,
            numberOfGuests: 2
        };

        this.handleInputChange = this.handleInputChange.bind(this);
    }

    handleInputChange(event) {
        const target = event.target;
        const value = target.type === 'checkbox' ? target.checked : target.value;
        const name = target.name;

        this.setState({
            [name]: value
        });
    }
    render() {
        return (
            <div>
                <h3>Filters</h3>
                <form onSubmit={this.handleSubmit}>
                {
                    // Condition
                }
                <ul className="list-group">
                <li className="list-group-item">
                    <h4>Condition</h4>
                    <label>
                    <input name="New" type="checkbox" checked={this.state.condition} onChange={this.handleInputChange} />
                    New
                    </label>
                    <br/>
                    <label>
                    <input name="Used" type="checkbox" checked={this.state.condition} onChange={this.handleInputChange} />
                    Used
                    </label>
                    <br/>
                    <label>
                    <input name="Renewed" type="checkbox" checked={this.state.condition} onChange={this.handleInputChange} />
                    Renewed
                    </label>
                    <br/>
                    <br/>
                    </li>
                    {
                        //  Price  
                    }
                <li className="list-group-item">
                    <h4>Price</h4>
                    <label>
                    <input name="price1" type="checkbox" checked={this.state.price} onChange={this.handleInputChange} />
                    Under $25
                    </label>
                    <br/>
                    <label>
                    <input name="price2" type="checkbox" checked={this.state.condition} onChange={this.handleInputChange} />
                    $25 to $50
                    </label>
                    <br/>
                    <label>
                    <input name="price3" type="checkbox" checked={this.state.condition} onChange={this.handleInputChange} />
                    $50 to $100
                    </label>
                    <br/>
                    <label>
                    <input name="price4" type="checkbox" checked={this.state.condition} onChange={this.handleInputChange} />
                    $100 to $200
                    </label>
                    <br/>
                    <label>
                    <input name="price3" type="checkbox" checked={this.state.condition} onChange={this.handleInputChange} />
                    $200 and above
                    </label>
                    <br/>
                    <br/>
                </li>
                <li className="list-group-item">
                {
                    //  Size  
                }
                    <h4>Size</h4>
                    <label>
                    <input name="size1" type="checkbox" checked={this.state.price} onChange={this.handleInputChange} />
                    34
                    </label>
                    <br/>
                    <label>
                    <input name="size2" type="checkbox" checked={this.state.condition} onChange={this.handleInputChange} />
                    36
                    </label>
                    <br/>
                    <label>
                    <input name="size3" type="checkbox" checked={this.state.condition} onChange={this.handleInputChange} />
                    38
                    </label>
                    <br/>
                    <label>
                    <input name="size4" type="checkbox" checked={this.state.condition} onChange={this.handleInputChange} />
                    40
                    </label>
                    <br/>
                </li>
                </ul>
                </form>
            </div>
        );
    }
}

export default Filter;
