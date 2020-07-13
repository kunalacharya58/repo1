export class Response {
	qid:number;
	question:string;
	response:string;
	answer:string;

	constructor(qid:number, question:string, response:string, answer:string) {
		this.qid = qid;
		this.question = question;
		this.response = response;
		this.answer = answer;
	}
}
