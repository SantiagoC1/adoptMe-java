package com.adoptme.petshop.services;

import com.adoptme.petshop.entities.Pet;
import com.adoptme.petshop.entities.User;
import com.adoptme.petshop.repositories.PetsRepository;
import com.adoptme.petshop.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetsService {
    @Autowired private
    PetsRepository petsRepository;

    public Pet save(Pet pet){
        return petsRepository.save(pet);
    }

    public List<Pet> readAll(){
        return petsRepository.findAll();
    }

    public Optional<Pet> readOne(Long id){
        return petsRepository.findById(id);
    }

    public void destryOne(Long id){
        petsRepository.deleteById(id);
    }

}
