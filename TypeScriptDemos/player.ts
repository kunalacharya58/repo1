export class Player {
	private id:number;
	private name:string;
	
	constructor(id:number, name:string) {
		this.id = id;
		this.name = name;
	}

	getId() {
		return this.id;
	}

	getName() {
		return this.name;
	}

	printPlayer() {
		console.log("id = "+this.id+" name = "+this.name);
	}
}