import { Injectable } from "@angular/core";
import { Resolve } from "@angular/router";
import { DataServiceService } from "../service/data-service.service";
import { Observable } from "rxjs";

@Injectable({ providedIn: 'root' })
export class Postresolver implements Resolve<any> {
  constructor(private dataService: DataServiceService) {}

  resolve(): Observable<any> {
    return this.dataService.getDataWithHeaders();// API call
  }
}