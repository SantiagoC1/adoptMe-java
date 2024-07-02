package com.adoptme.petshop.services;

import com.adoptme.petshop.entities.User;
import com.adoptme.petshop.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    //para obtener la info de un repositorio
    @Autowired private UsersRepository usersRepository;

    public User save(User user){
        return usersRepository.save(user);
    }

    public List<User> readAll(){
        return usersRepository.findAll();
    }

    public Optional<User> readOne(Long id){
        return usersRepository.findById(id);
    }

    public void destryOne(Long id){
        usersRepository.deleteById(id);
    }
}
