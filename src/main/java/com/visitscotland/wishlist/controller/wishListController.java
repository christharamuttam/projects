package com.visitscotland.wishlist.controller;

import com.visitscotland.wishlist.model.item;
import com.visitscotland.wishlist.model.resultobj;
import com.visitscotland.wishlist.model.wishlist;
import com.visitscotland.wishlist.service.ItemService;
import com.visitscotland.wishlist.service.wishlistService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wishlist")
public class wishListController {

    private static final Logger logger = LogManager.getLogger(wishListController.class);
    @Autowired
    private wishlistService service;

    @PostMapping("/createWishList")
    public String createWishList(@RequestBody resultobj Resultobj) {



        logger.info("Request Parameter Wishlist Item ID:" + Resultobj.getWishlistItemID());
        logger.info("Wish created for User: "  + Resultobj.getUserName());
        logger.info("Title :" + Resultobj.getItemTitle());
        logger.info("Category" + Resultobj.getItemCategory());

        List<resultobj> existinglist = service.listItem1(Resultobj.getUserName());

        if (existinglist.isEmpty()) {
            service.createWishlist(Resultobj);
            logger.info("Wish list created Successfully");
            return "created";
        }

        if (existinglist != null && existinglist.size()>0 ){
            logger.info("list is not empty"+existinglist.size());
            //  existinglist.get(0).getWishlistItemID() != wishlist.getWishlistItemID());

                service.createWishlist(Resultobj);
                return "created";
        }else {
               service.createWishlist(Resultobj);
                return "already exists";
        }

    }



    @PostMapping("/createWishListold")
    public int createWishListold(@RequestBody wishlist wishlist) {

        service.createWishlistold(wishlist);
         return wishlist.getItemId();

    }

    @GetMapping("/listold/{user}")
    public List<wishlist> getwishList(@PathVariable String user){
        return service.getwishList(user);
    }

    @GetMapping("/list")
    public List<resultobj> listItem(){
        return service.listItem();
    }


    @GetMapping("/list1/{user}")
    public List<resultobj> listItem1(@PathVariable String user){
         return service.listItem1(user);
    }

    @DeleteMapping("/deletewishlist/{id}")
    private void deleteStudent(@PathVariable("id") int id)
    {
        service.delete(id);
    }

}
