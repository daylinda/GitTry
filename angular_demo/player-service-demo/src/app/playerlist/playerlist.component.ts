import { Component, OnInit } from '@angular/core';
import { PlayerService } from '../player.service';
import { Player } from '../player';

@Component({
  selector: 'app-playerlist',
  templateUrl: './playerlist.component.html',
  styleUrls: ['./playerlist.component.sass']
})
export class PlayerlistComponent implements OnInit {
  players:Player[];
  constructor(private service:PlayerService) { }

  ngOnInit() {
    this.players=this.service.getAllPlayers();
  }

}
