import { Car } from "./Car";

let showroom = [];

showroom.push(new Car("Tata", "Nano", "4", "Mini", "Yellow"));
showroom.push(new Car("Tata", "Sumo", "8", "Off-road", "White"));
showroom.push(new Car("Mahindra", "Bolero", "9", "Off-road", "Black"));
showroom.push(new Car("Porsche", "Lamborghini", "2", "Race", "Red"));

console.log(showroom);

// showroom.forEach(car => {
// 	console.log(JSON.stringify(car));
// });