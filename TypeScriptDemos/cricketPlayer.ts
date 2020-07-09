import {Player} from './player';
import { Coach } from './coach';

export class CricketPlayer extends Player {
	private team : string
	private coach : Coach;

	constructor(id:number, name:string, team:string, coach:Coach) {
		super(id, name);
		this.team = team;
		this.coach = coach;
	}

	printPlayer() {
		console.log("id = "+super.getId()+" name = "
		+super.getName()+" team = "+this.team+
		" coach = "+this.coach.getName());
	}
}