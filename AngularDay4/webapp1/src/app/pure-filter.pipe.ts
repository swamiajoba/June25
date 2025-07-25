import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'pureFilter',
  pure:true
})
export class PureFilterPipe implements PipeTransform {
 callCount = 0;

  transform(items: string[], search: string): string[] {
    this.callCount++;
    console.log('Pure Pipe called:', this.callCount);

    if (!search) return items;
    return items.filter(item => item.toLowerCase().includes(search.toLowerCase()));
  }


  // transform(value: unknown, ...args: unknown[]): unknown {
  //   return null;
  // }

}
