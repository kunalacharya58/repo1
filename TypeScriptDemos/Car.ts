
export class Car {
	private static ID:number = 0;
	private id:number;
	private brand: string;
	private name: string;
	private seats: string;
	private type: string;
	private color: string;

	constructor(brand:string, name:string, seats:string, type:string, color:string) {
		this.id = ++Car.ID;
		this.brand = brand;
		this.name = name;
		this.seats = seats;
		this.type = type;
		this.color = color
	}
}