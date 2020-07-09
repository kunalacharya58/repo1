export class Coach {

	private name:string;
	
	constructor (name:string) {
		this.name = name;
	}

	getName () {
		return this.name;
	}

	printCoach() {
		console.log("Coach Name = "+this.name);
	}
}