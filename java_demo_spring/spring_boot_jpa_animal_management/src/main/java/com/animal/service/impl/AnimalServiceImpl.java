package com.animal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.animal.dao.AnimalDAO;
import com.animal.exception.BusinessException;
import com.animal.model.Animal;
import com.animal.service.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {
	
	@Autowired
	private AnimalDAO dao;
	
	@Override
	public Animal createAnimal(Animal animal) {
		
		return dao.save(animal);
	}

	@Override
	public Animal updateAnimal(Animal animal) {
		
		return dao.save(animal);
	}

	@Override
	public Animal getAnimalById(int id) throws BusinessException{
		
		if(id<=0) {
			throw new BusinessException("id");
		}
		
		Animal animal = null;
		
		try {
			
			animal = dao.findById(id).get();//findById returns functional interface so fetch data by .get()
			
		}catch(BusinessException e){
			
			throw new BusinessException("animal is null");
		}
		
		return animal;
	}

	@Override
	public List<Animal> getAllAnimals() {
		
		return dao.findAll();
	}

	@Override
	public List<Animal> getAnimalsByAge(int age) {
		
		return dao.findByAge(age);
	}

	@Override
	public List<Animal> getAnimalsByCategory(String category) {
		
		return dao.findByCategory(category);
	}

	@Override
	public void deleteAnimalByID(int id) {
		dao.deleteById(id);
		
	}

}
