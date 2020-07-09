export abstract class Requirement {
	display():void {
		console.log("Hello Abstract");
	}
	abstract reqruirement1():void;
}

export class Implementor extends Requirement {
	reqruirement1(): void {
		console.log("requirement1");
	}
}