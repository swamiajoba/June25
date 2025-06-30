import { Component, OnInit } from '@angular/core';
import { DataServiceService } from '../service/data-service.service';


@Component({
  selector: 'app-mydata',
  templateUrl: './mydata.component.html',
  styleUrls: ['./mydata.component.css']
})
export class MydataComponent implements OnInit{

   data: any;
  error: string = '';

  constructor(private dataService: DataServiceService) {}

  ngOnInit(): void {
    this.dataService.getDataWithHeaders().subscribe({
      next: (res) => this.data = res,
      error: (err) => this.error = err.message
    });
  }

}
