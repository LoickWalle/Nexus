import {Component} from '@angular/core';
import {FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators} from '@angular/forms';
import {Login} from '../../models/login.interface';
import {ButtonComponent} from '../button/button.component';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [
    FormsModule,
    ReactiveFormsModule,
    ButtonComponent
  ],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

  BUTTON_LABEL: string = "Se connecter";

  formLogin = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.email]),
    password: new FormControl('', [Validators.required]),
    isRemembered: new FormControl(false),
  });

  log() {
    if (this.formLogin.valid) {
      console.log(this.formLogin.value as Login);
      this.formLogin.reset();
    }
  }

  get email() {
    return this.formLogin.controls.email;
  }

  get password() {
    return this.formLogin.controls.password;
  }
}
