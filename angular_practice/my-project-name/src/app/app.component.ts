import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  // title = 'my-project-name';
  name = 'Isaac Gentry';
  pizzaList = ['Imos', 'Dominoes', 'Little Caesars', 'Pizza Hut'];
  rectangle = {
    length: 5,
    width: 6,
    area: function() {
       return this.length * this.width;
    }
 }
}