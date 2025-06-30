import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { catchError, throwError, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {
private apiUrl = 'https://jsonplaceholder.typicode.com/posts';

  constructor(private http: HttpClient) {}

  getDataWithHeaders(): Observable<any> {
    const headers = new HttpHeaders({
      'Custom-Header': 'Angular15'
    });

    return this.http.get(this.apiUrl, { headers }).pipe(
      catchError(this.handleError)
    );
  }

  private handleError(error: HttpErrorResponse) {
    console.error('Server Error:', error);
    if (error.error instanceof ErrorEvent) {
      return throwError(() => new Error(`Client-side error: ${error.error.message}`));
    } else {
      return throwError(() => new Error(`Server error: ${error.status} ${error.message}`));
    }
  }
}
