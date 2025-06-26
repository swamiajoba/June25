import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-live-score-comp',
  templateUrl: './live-score-comp.component.html',
  styleUrls: ['./live-score-comp.component.css']
})
export class LiveScoreCompComponent implements OnInit {

   players = [
    { name: 'Alice', score: 0 },
    { name: 'Bob', score: 0 },
    { name: 'Charlie', score: 0 }
  ];

  threshold = 0;
  ngOnInit() {
    // Simulate live score updates (object mutation)
    setInterval(() => {
      const randomIndex = Math.floor(Math.random() * this.players.length);
      this.players[randomIndex].score += Math.floor(Math.random() * 10);
    }, 1000);
   }
}
