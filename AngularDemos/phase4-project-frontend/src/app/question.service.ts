import { HttpClient } from '@angular/common/http'
import { Injectable } from '@angular/core';
import { Question } from './question';
import { Observable } from 'rxjs';
import { Response } from './response';
import { Result } from './result';

@Injectable({
  providedIn: 'root'
})
export class QuestionService {
  
  private getQuesUrl:string;
  private getResultUrl:string;
  private resultUrl:string;
  private responses:Response[];

  constructor(private http:HttpClient) { 
    this.getQuesUrl = "http://localhost:9090/questions";
    this.getResultUrl = "http://localhost:9090/results";
    this.resultUrl = "http://localhost:9090/result";
  }

  public getAllQuestions():Observable<Question[]> {
    return this.http.get<Question[]>(this.getQuesUrl);
  }

  public storeResult(result:Result): Observable<Result> {
    return this.http.post<Result>(this.resultUrl, result);
  }

  public getAllResults() {
    return this.http.get<Result[]>(this.getResultUrl);
  }

  public setResponses(responses:Response[]) {
    this.responses = responses;
  }

  getResponses():Response[] {
    return this.responses;
  }
}
