import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Login} from '../models/login.interface';
import {Observable} from 'rxjs';
import {environment} from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  private ACCOUNT_URL: string = environment.BASE_URL + "/posts";

  constructor(private httpClient: HttpClient) { }

  login(login: Login): Observable<Login> {
    return this.httpClient.post<Login>(this.ACCOUNT_URL, login);
    //TODO handle potential errors (error service)
    //TODO logic autour du isRemembered
  }
}
