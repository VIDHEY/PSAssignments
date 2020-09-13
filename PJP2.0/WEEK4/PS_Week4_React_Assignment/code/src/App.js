import React from 'react';
import Navbar from './components/layout/Navbar'
import ShopItemSet from './components/layout/ShopItemSet'
import Sidebar from './components/layout/Sidebar'
import './App.css';

class App extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      cloths: [
        {
          clothName: "Dress1",
          price: "$19.99",
          imgSrc: "img1.png"
        },
        {
          clothName: "Dress2",
          price: "$19.99",
          imgSrc: "img2.png"
        },
        {
          clothName: "Dress3",
          price: "$19.99",
          imgSrc: "img3.png"
        },
        {
          clothName: "Dress4",
          price: "$19.99",
          imgSrc: "img4.png"
        },
        {
          clothName: "Dress5",
          price: "$19.99",
          imgSrc: "img5.png"
        },
        {
          clothName: "Dress6",
          price: "$19.99",
          imgSrc: "img6.png"
        }],
    }
  }

  render() {
    return (
      <div className="container-fluid">
        <Navbar />
        <div className="row">
          <Sidebar />
          <ShopItemSet cloths={this.state.cloths}/>
        </div>
      </div>
    );
  }
}

export default App;
