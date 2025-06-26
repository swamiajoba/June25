import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'liveScore',
  pure:false
})
export class LiveScorePipe implements PipeTransform {

  transform(players: any[], threshold: number): any[] {
    // Filter only those with score >= threshold
    return players.filter(p => p.score >= threshold);
  }

}
