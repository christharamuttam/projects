package com.visitscotland.wishlist.service;
import com.visitscotland.wishlist.exceptions.customException;
import com.visitscotland.wishlist.model.user;
import com.visitscotland.wishlist.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class userService {


    @Autowired
    userRepository userRepositoryRepo;


    public void createUser(user user){
        if (Objects.nonNull(userRepositoryRepo.findByEmail(user.getEmail()))){
            throw new customException("User Already present");
        }
        userRepositoryRepo.save(user);
    }

    public List<user> listUser(){
        return userRepositoryRepo.findAll();
    }


    public String signIn(String user){

        if (Objects.nonNull(userRepositoryRepo.findByEmail(user))){
            return user;
        } else{
            throw new customException("Invalid User or Password:");
        }

    }



}
