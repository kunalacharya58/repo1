export interface MyInterface {
	requirement1():void;
	requirement2():void;
	requirement3():void;
}

export class MyImplementor implements MyInterface {
	requirement1(): void {
		console.log("requirement 1 satisfied.");
	}
	requirement2(): void {
		console.log("requirement 2 satisfied.");
	}
	requirement3(): void {
		console.log("requirement 3 satisfied.");
	}
	
}