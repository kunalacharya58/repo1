import { Component, OnInit } from '@angular/core';
import { Player } from '../player';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.scss']
})
export class HelloComponent implements OnInit {

  players:Player[]= [];
  idModel:number;
  playerModel:Player;
  constructor() {
    this.playerModel = new Player();
	  // let p1:Player={
		//   id:100,
		//   name:"Sachin",
		//   age:44,
    //   teamName:"India",
    //   avatar: "https://m.cricbuzz.com/a/img/v1/192x192/i1/c171004/sachin-tendulkar.jpg"
    // }
    // this.players.push(p1);
    // this.players.push(new Player(101, "Ganguly", 48, "India", "https://c.ndtvimg.com/2020-07/ovuigcps_sourav-ganguly-afp_625x300_08_July_20.jpg?q=60&imwidth=555"));
    // this.players.push(new Player(102, "Rohit", 38, "India", "https://upload.wikimedia.org/wikipedia/commons/f/f7/Rohit_Sharma_November_2016_%28cropped%29.jpg"));
    // this.players.push(new Player(143, "Gilchrist", 41, "Australia", "https://m.cricbuzz.com/a/img/v1/192x192/i1/c156206/adam-gilchrist.jpg"));
  }

  createPlayer() {
    this.players.push(this.playerModel);
    this.playerModel = new Player();
  }

  removeLastPlayer() {
    this.players.pop();
  }

  removeById() {
    let index= this.players.findIndex(i=>i.id===this.idModel);
    this.players.splice(index,1);
  }

  ngOnInit() {
  }

}
