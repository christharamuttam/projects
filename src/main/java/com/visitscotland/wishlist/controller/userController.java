package com.visitscotland.wishlist.controller;


import com.visitscotland.wishlist.model.user;
import com.visitscotland.wishlist.service.userService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("user")
@RestController
public class userController {

    private static final Logger logger = LogManager.getLogger(userController.class);

    @Autowired
    userService usrService;

    @PostMapping("/createUser")
    public String signup(@RequestBody user usr){
        usrService.createUser(usr);
        logger.info("New User Created Successfully");
        return "user Created Successfully";
    }

    @GetMapping("/list")
    public List<user> listItem(){
        return usrService.listUser();
    }

    @GetMapping("/login/{email}")
    public String login(@PathVariable String email){
        logger.debug("Getting the Path variable");
        return usrService.signIn(email);
    }

}
