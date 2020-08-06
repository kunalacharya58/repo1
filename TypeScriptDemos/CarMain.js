"use strict";
exports.__esModule = true;
var Car_1 = require("./Car");
var showroom = [];
showroom.push(new Car_1.Car("Tata", "Nano", "4", "Mini", "Yellow"));
showroom.push(new Car_1.Car("Tata", "Sumo", "8", "Off-road", "White"));
showroom.push(new Car_1.Car("Mahindra", "Bolero", "9", "Off-road", "Black"));
showroom.push(new Car_1.Car("Porsche", "Lamborghini", "2", "Race", "Red"));
console.log(showroom);
// showroom.forEach(car => {
// 	console.log(JSON.stringify(car));
// });
