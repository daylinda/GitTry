import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AnimalListComponent } from './animal-list/animal-list.component';
import { CreateAnimalComponent } from './create-animal/create-animal.component';
import { DeleteAnimalComponent } from './delete-animal/delete-animal.component';
import { HttpClientModule } from '@angular/common/http';
import { AnimalService } from './animal.service';

@NgModule({
  declarations: [
    AppComponent,
    AnimalListComponent,
    CreateAnimalComponent,
    DeleteAnimalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [AnimalService],
  bootstrap: [AppComponent]
})
export class AppModule { }
