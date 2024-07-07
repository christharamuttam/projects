package com.visitscotland.wishlist.controller;

import com.visitscotland.wishlist.model.item;
import com.visitscotland.wishlist.service.ItemService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Item")
public class ItemController {

    private static final Logger logger = LogManager.getLogger(ItemController.class);

    @Autowired
    private ItemService service;

    @PostMapping("/create")
    public String createItem(@RequestBody item Item){
        service.createItem(Item);
        logger.info("Item created successfully");
        return "success";
    }


    @GetMapping("/list")
    public List<item> listItem(){
        logger.info("Getting the Item List");
        return service.listItem();
    }


}
