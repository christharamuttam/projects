package com.visitscotland.wishlist.service;
import com.visitscotland.wishlist.model.resultobj;
import com.visitscotland.wishlist.model.wishlist;
import com.visitscotland.wishlist.repository.resultobjRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class resultobjService {

    private static final Logger logger = LogManager.getLogger(resultobjService.class);
    @Autowired
    resultobjRepository resultobjRepo;

    public resultobj createWishlist(resultobj resultobj){
        return resultobjRepo.save(resultobj);
    }

    public List<resultobj> getwishList(){

        return resultobjRepo.findAll();

    }


    public List<resultobj> getWishListByUserNameAndCategory(String userName,String itemCategory){

        return resultobjRepo.findByUserNameAndItemCategory(userName,itemCategory);
    }

    public List<resultobj> getwishListByUserName(String userName){

        return resultobjRepo.findByUserName(userName);
    }


    public void removeWishlist(Integer wishlistID){
        resultobjRepo.deleteById(wishlistID);
    }

    public void removeAllwishList(String userName){
        List<resultobj> wishlistAll=resultobjRepo.findByUserName(userName);
        wishlistAll.forEach( (element) -> {
            logger.info("element ID"+ element.getWishlistID() );
            resultobjRepo.deleteById(element.getWishlistID());
        });


    }

}
