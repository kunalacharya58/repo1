export class Result {
	id:number;
	correct:number;
	incorrect:number;
	total:number;

	constructor(correct:number, incorrect:number, total:number) {
		this.correct = correct;
		this.incorrect = incorrect;
		this.total = total;
	}
}
