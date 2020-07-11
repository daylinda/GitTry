import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Pipes';
  mydate = new Date();
  jsonData ={name:"sachin"};
  fruits = ['apple','banna','chicko'];
  firstname = "Davina";
  lastname = "Pinto";
}
