import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor,
  HttpErrorResponse
} from '@angular/common/http';
import { catchError, Observable, throwError } from 'rxjs';

@Injectable()
export class AuthInterceptor implements HttpInterceptor {

  constructor() {}

   intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    const clonedRequest = req.clone({
      setHeaders: {
        'Authorization': 'Bearer token-from-interceptor'
      }
    });

       // ✅ Log full URL and method
    console.log('🔗 Request URL:', clonedRequest.url);
    console.log('📬 Method:', clonedRequest.method);

    // ✅ Log headers
    clonedRequest.headers.keys().forEach(headerName => {
      console.log(`🧾 Header - ${headerName}: ${clonedRequest.headers.get(headerName)}`);
    });

    return next.handle(clonedRequest).pipe(
      catchError((error: HttpErrorResponse) => {
        console.warn('Interceptor caught error:', error);
        return throwError(() => error);
      })
    );
  }

  // intercept(request: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {
  //   return next.handle(request);
  // }
}
