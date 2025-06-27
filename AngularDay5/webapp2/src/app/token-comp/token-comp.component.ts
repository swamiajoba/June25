import { Component } from '@angular/core';
import { TokenService } from '../service/token.service';

@Component({
  selector: 'app-token-comp',
  templateUrl: './token-comp.component.html',
  styleUrls: ['./token-comp.component.css'],
  providers:[TokenService]
})
export class TokenCompComponent {
  constructor(tokenService: TokenService) {}
}
