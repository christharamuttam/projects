package com.visitscotland.wishlist.repository;

import com.visitscotland.wishlist.model.item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itemRepository extends JpaRepository<item, Integer>{
}
