package com.visitscotland.wishlist.repository;

import com.visitscotland.wishlist.model.resultobj;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface resultobjRepository extends JpaRepository<resultobj, Integer> {

   // @Query( value="select w.userName ,w.wishlistItemID,i.title from resultobj w, item i where w.wishlistItemID=i.id and w.userName=?1")
    List<resultobj> findByUserName(String userName);

    List<resultobj> findByUserNameAndItemCategory(String userName, String itemCategory);
}