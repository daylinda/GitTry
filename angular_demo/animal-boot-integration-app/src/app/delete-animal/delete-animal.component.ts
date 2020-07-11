import { Component, OnInit, ɵPlayer } from '@angular/core';
import { AnimalService } from '../animal.service';
import { Animal } from '../animal';

@Component({
  selector: 'app-delete-animal',
  templateUrl: './delete-animal.component.html',
  styleUrls: ['./delete-animal.component.css']
})
export class DeleteAnimalComponent implements OnInit {
  idModule:number
  animals:Animal[];
  constructor(private service:AnimalService) { }

  deleteAnimal(idModule:number){
    return this.service.deleteAnimal().subscribe(res=>);

  }
  ngOnInit() {
  }

}
