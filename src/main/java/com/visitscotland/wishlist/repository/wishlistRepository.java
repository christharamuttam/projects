package com.visitscotland.wishlist.repository;

import com.visitscotland.wishlist.model.item;
import com.visitscotland.wishlist.model.resultobj;
import com.visitscotland.wishlist.model.user;
import com.visitscotland.wishlist.model.wishlist;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

import java.util.Collection;

@Repository
public interface wishlistRepository extends JpaRepository<wishlist, Integer> {

    // @Query( value="select w.user ,w.itemId from wishlist w, item i where w.itemId=i.id and w.user=?1")
    //List<wishlist> findByUserName(String user);


}