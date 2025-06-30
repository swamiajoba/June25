import { Observable } from "rxjs";

export function fetchEmails() {
    return new Observable<string[]>(sub => {
      const t = setTimeout(() => {
        sub.next(['aa@abc.com', 'bb@abc.com', 'cc@abc.com']);
        sub.complete();
        clearTimeout(t);
      }, 1000)
    })
  }
  