import { Inject, Injectable, Optional } from '@angular/core';
import { API_URL } from '../token/injection.token';

@Injectable()
export class TokenService {
constructor(@Optional() @Inject(API_URL) private apiUrl?: string) {
    console.log('API_URL:', this.apiUrl || 'Not provided');
  }
}
