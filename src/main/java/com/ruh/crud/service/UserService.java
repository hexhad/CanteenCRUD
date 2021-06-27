package com.ruh.crud.service;

import com.ruh.crud.entity.User;
import com.ruh.crud.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Transactional(propagation = Propagation.SUPPORTS)
    public List getAllUsers(){
        return userRepo.findAll();
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public Optional<User> getUserById(Integer Id){
        return userRepo.findAllById(Id);
    }
}
