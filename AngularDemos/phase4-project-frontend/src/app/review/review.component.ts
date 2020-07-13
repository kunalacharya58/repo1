import { Component, OnInit } from '@angular/core';
import { QuestionService } from '../question.service';
import { Response } from '../response';
import { Router } from '@angular/router';

@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.css']
})
export class ReviewComponent implements OnInit {

  private responses:Response[];

  constructor(private service:QuestionService, private router: Router) { 

  }

  ngOnInit() {
    this.responses = this.service.getResponses();
  }

  gotoResults() {
    this.router.navigate(['/result']);
  }

}
