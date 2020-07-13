import { Component, OnInit } from '@angular/core';
import { QuestionService } from '../question.service';
import { Response } from '../response';
import { Result } from '../result';
import { Router } from '@angular/router';

@Component({
  selector: 'app-result',
  templateUrl: './result.component.html',
  styleUrls: ['./result.component.css']
})
export class ResultComponent implements OnInit {

  private responses:Response[];
  private result:Result;
  private results:Result[];
  private right:number;
  private wrong:number;
  private total:number;
  private score:number;

  constructor(private service:QuestionService, private router:Router) {
    
  }

  calculate() {
    this.responses = this.service.getResponses();
    this.right = 0;
    this.total = 0;
    this.wrong = 0;
    for (let response of this.responses) {
      if (response.response) {
        if (response.response == response.answer) {
          this.right += 1;
        } else {
          this.wrong += 1;
        }
      }
      this.total += 1;
    }
    this.score = 100*this.right/this.total;
    this.service.storeResult(new Result(this.right, this.wrong, this.total)).subscribe(res => {
      this.retreive();
    });
  }

  ngOnInit() {
    this.calculate();
  }

  retreive() {
    this.service.getAllResults().subscribe(res=> {
      this.results = res;
      this.results.sort((a:Result, b:Result)=>{
        return b.id - a.id;
      });
    });
  }

  gotoQuiz() {
    this.router.navigate(['']);
  }

}
