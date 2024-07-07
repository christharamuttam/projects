package com.visitscotland.wishlist.controller;


import com.visitscotland.wishlist.model.resultobj;
import com.visitscotland.wishlist.service.resultobjService;
import com.visitscotland.wishlist.service.wishlistService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resultobj")
public class resultobjController {

    private static final Logger logger = LogManager.getLogger(resultobjController.class);

    @Autowired
    private resultobjService resultobjServ;

    @PostMapping("/createWishList")
    public String createWishList(@RequestBody resultobj Resultobj) {

        List<resultobj> lstobj = resultobjServ.getwishListByUserName(Resultobj.getUserName());
        logger.info("existing wish list:"+lstobj);
        if (lstobj.isEmpty()) {
            resultobjServ.createWishlist(Resultobj);
            return "Success";
        }
        if (lstobj != null && lstobj.size() > 0) {
            resultobj lst=null;
            for (int i = 0; i < lstobj.size(); i++) {
                lst = (resultobj) lstobj.get(i);
                logger.info("lst.getWishlistItemID():"+lst.getWishlistItemID());
                logger.info("Resultobj.getWishlistItemID()"+Resultobj.getWishlistItemID());
                if (Resultobj.getWishlistItemID().equals(lst.getWishlistItemID())) {
                    return "Failed";
                }
            }

        }
        resultobjServ.createWishlist(Resultobj);
        return "Success";
    }



    @GetMapping("/getWishlist")
    public List<resultobj> listItem(){
        return resultobjServ.getwishList();
    }



    @GetMapping("/getWishlist/{userName}/{itemCategory}")
    public List<resultobj> getWishListByUserNameAndCategory(@PathVariable String userName, @PathVariable String itemCategory){

        return resultobjServ.getWishListByUserNameAndCategory(userName,itemCategory);
    }


    @GetMapping("/getWishlist/{userName}")
    public List<resultobj> getWishlistbyUserName(@PathVariable String userName){

        return resultobjServ.getwishListByUserName(userName);
    }


    @DeleteMapping("/removeWishlist/{wishlistID}")
    public String removeWishlist(@PathVariable Integer wishlistID){

       logger.info("wish list ID to be deleted:"+wishlistID);

       resultobjServ.removeWishlist(wishlistID);
       return "success";
    }


    @DeleteMapping("/removeAllWishlist/{userName}")
    public String removeWishlist(@PathVariable String userName){

        logger.info("wish list ID to be deleted for the user:"+userName);
        resultobjServ.removeAllwishList(userName);
        return "success";
    }


}
