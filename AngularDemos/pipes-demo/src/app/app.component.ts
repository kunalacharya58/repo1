import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Pipes';
  myDate = new Date();
  player = {
    name : "Sachin",
    age : "34",
    address : "Mumbai",
    team : "India"
  };
  fruits = ["Apple", "Mango", "Pineapple", "Litchi", "Orange", "Sweet Lime"];
  fname="M S";
  lname=" Dhoni";
}
