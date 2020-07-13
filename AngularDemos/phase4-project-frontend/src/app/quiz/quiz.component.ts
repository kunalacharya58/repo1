import { Component, OnInit } from '@angular/core';
import { Question } from '../question';
import { QuestionService } from '../question.service';
import { Router } from '@angular/router';
import { Response } from '../response';

@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.css']
})
export class QuizComponent implements OnInit {

  private questions:Question[];
  private responses:Response[] = [];

  // question:Question = {
  //   id: 2,
  //   question: "This is a dummy question",
  //   opt1: "Option 1",
  //   opt2: "Option 2",
  //   opt3: "Option 3",
  //   opt4: "Option 4",
  //   answer: "This is the solution"
  // };


  constructor(private service:QuestionService, private router:Router) { 
  }

  ngOnInit() {
    this.service.getAllQuestions().subscribe(res=> {
      this.questions = res;
    });
  }

  collectResponses() {
    this.questions.forEach((question) => {
      let response:Response = new Response(question.id, question.question, question.response, question.answer);
      this.responses.push(response);
    });
    this.service.setResponses(this.responses);
    this.router.navigate(['/review']);
  }

}
