package com.visitscotland.wishlist.service;

import com.visitscotland.wishlist.model.wishlist;
import com.visitscotland.wishlist.model.item;
import com.visitscotland.wishlist.repository.itemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ItemService {

    @Autowired
    itemRepository ItemRepo;


    public item createItem(item Item){
        return ItemRepo.save(Item);
    }

    public List<item> listItem(){
        return ItemRepo.findAll();
    }




}
