package com.visitscotland.wishlist.service;
import com.visitscotland.wishlist.model.resultobj;
import com.visitscotland.wishlist.model.wishlist;
import com.visitscotland.wishlist.repository.resultobjRepository;
import com.visitscotland.wishlist.repository.wishlistRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class wishlistService {

    private static final Logger logger = LogManager.getLogger(wishlistService.class);
    @Autowired
    wishlistRepository wishlistRepo;
    @Autowired
    resultobjRepository resultobjRepo;



    public void createWishlist(resultobj resultobj){
        resultobjRepo.save(resultobj);
    }

    public wishlist createWishlistold(wishlist wishlist){
        return wishlistRepo.save(wishlist);
    }

    public List<wishlist> getwishList(String userName){

        return wishlistRepo.findAll();

    }


    public List<resultobj> listItem(){

        return resultobjRepo.findAll();
    }



    public List<resultobj>listItem1(String userName){
        logger.info("name :"+userName);
        return resultobjRepo.findByUserName(userName);
    }

    //deleting a specific record
    public void delete(int id)
    {
        resultobjRepo.deleteById(id);
    }





}
