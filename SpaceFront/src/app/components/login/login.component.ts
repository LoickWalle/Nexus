import {Component} from '@angular/core';
import {FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators} from '@angular/forms';
import {Login} from '../../models/login.interface';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [
    FormsModule,
    ReactiveFormsModule
  ],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

  formLogin = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.email]),
    password: new FormControl('', [Validators.required]),
    isRemembered: new FormControl(false),
  });

  log() {
    if (this.formLogin.valid) {
      console.log(this.formLogin.value as Login);
    }
  }

  get email() {
    return this.formLogin.controls.email;
  }

  get password() {
    return this.formLogin.controls.password;
  }
}
