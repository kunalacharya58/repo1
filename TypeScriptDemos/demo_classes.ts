import {Player} from './player';
import {CricketPlayer} from './cricketPlayer'
import { Coach } from './coach';

class Hello {
	/*
	** no constructor overloading.
	** only 3 access specifiers.
	*/
	message:string;
	constructor(message:string) {
		this.message = message;
	}

	printMessage() {
		console.log(this.message);
	}
}

let h = new Hello("hello class");
h.printMessage();

let p = new Player(10, "Sachin");
p.printPlayer();

let cp = new CricketPlayer(18, "Kohli", "India", new Coach("Garry"));
cp.printPlayer();