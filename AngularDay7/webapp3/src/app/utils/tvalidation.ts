import { FormGroup } from "@angular/forms";

export default class Tvalidation {
    
      static match(controlName: string, checkControlName: string) {
        return (formGroup: FormGroup) => {
            // generating FormControl object
            const control = formGroup.controls[controlName];    /// fetching control object of password
            const checkControl = formGroup.controls[checkControlName]; /// fetching control object of confirmPassword
      
            if (checkControl?.errors && !checkControl.errors['matching']) {
              return null;
            }
      
            if (control?.value !== checkControl?.value) {
              checkControl?.setErrors({ matching: true });
              return { matching: true };
            } else {
              checkControl?.setErrors(null);
              return null;
            }
          };
    }

}
