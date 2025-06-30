import { Component, OnInit } from '@angular/core';
import { DataServiceService } from '../service/data-service.service';
import { ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-mydata',
  templateUrl: './mydata.component.html',
  styleUrls: ['./mydata.component.css']
})
export class MydataComponent implements OnInit{

   data!: any[];
 

   constructor(private route: ActivatedRoute) {}

  ngOnInit(): void {
    this.data=this.route.snapshot.data['postData'];
  }

}
