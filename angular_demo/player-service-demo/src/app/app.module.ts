import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms'

import { AppComponent } from './app.component';
import { PlayerService } from './player.service';
import { PlayeraddComponent } from './playeradd/playeradd.component';
import { PlayerlistComponent } from './playerlist/playerlist.component';
import { PlayerdeleteComponent } from './playerdelete/playerdelete.component';

@NgModule({
  declarations: [
    AppComponent,
    PlayeraddComponent,
    PlayerlistComponent,
    PlayerdeleteComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [PlayerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
