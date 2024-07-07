package com.visitscotland.wishlist;

import com.visitscotland.wishlist.controller.ItemController;
import com.visitscotland.wishlist.model.item;
import com.visitscotland.wishlist.model.resultobj;
import com.visitscotland.wishlist.model.wishlist;
import com.visitscotland.wishlist.repository.itemRepository;
import com.visitscotland.wishlist.repository.resultobjRepository;
import com.visitscotland.wishlist.repository.wishlistRepository;
import com.visitscotland.wishlist.service.ItemService;
import com.visitscotland.wishlist.service.resultobjService;
import com.visitscotland.wishlist.service.wishlistService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


import org.springframework.web.context.WebApplicationContext;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
public class WishlistMockTest extends WishlistApplicationTests{



    @Autowired
    private WebApplicationContext webApplicationContext;

    @MockBean
    private itemRepository itemRepo;

    @MockBean
    private wishlistRepository wishRepo;

    @MockBean
    private resultobjRepository objRepo;

    @Autowired
    private ItemService serv;

    @Autowired
    private wishlistService wishServ;

    @Autowired
    private resultobjService objServ;

    @Test
    public void itShouldAddItem(){

        item testItem = new item();
        testItem.setTitle("ICEFIRE GLASS");
        testItem.setCategory("Attractions");
        testItem.setDescription("Ornamental glassware designers");
        testItem.setImage("img/IMGATTR3.jpeg");
        testItem.setOtherInfo("A glass studio and gallery open to the public");
        when(itemRepo.save(testItem)).thenReturn(testItem);
        assertEquals(testItem, serv.createItem(testItem));
    }

    @Test
    void itShouldGetAllItems() {

        item testItem1 = new item();
        testItem1.setTitle("CLYDE VALLEY PICTURE FRAMING");
        testItem1.setCategory("Attractions");
        testItem1.setDescription("Selection of original artwork, prints");
        testItem1.setImage("img/IMGATTR2.jpeg");
        testItem1.setOtherInfo("Clyde Valley Picture Framing ");

        item testItem2 = new item();
        testItem2.setTitle("Carmichael cottages- Bigger");
        testItem2.setCategory("Accommodation");
        testItem2.setDescription("Selection of original artwork, prints");
        testItem2.setImage("img/IMGACC5.jpeg");
        testItem2.setOtherInfo("Carmichael cottages offer you a warm welcome");


        when(itemRepo.findAll()).thenReturn(Stream.of(
                testItem1,
                testItem2).collect(Collectors.toList()));

        assertEquals(2, serv.listItem().size());
    }


    @Test
    public void itShouldAddWishlist(){

        wishlist wishlistobj = new wishlist();
        wishlistobj.setItemId(100);
        wishlistobj.setUser("myusename");

        when(wishRepo.save(wishlistobj)).thenReturn(wishlistobj);
        assertEquals(wishlistobj, wishServ.createWishlistold(wishlistobj));
    }


    @Test
    void ItemCreationShouldReturnMessageFromService() throws Exception {
        /*
        when(service.createItem(abc));
        this.mockMvc.perform(post("/create")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("success")));

       */
    }

    @Test
    public void testItem() throws Exception {
        /*
        mockMvc.perform(post("/create")).andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(jsonPath("$.title").value("fhfhf")).andExpect(jsonPath("$.category").value("manager"))
                .andExpect(jsonPath("$.description").value("dd")).andExpect(jsonPath("$.image").value("IMG.PNG"));
*/
    }

    @Test
    public void itShouldRemoveWishlist(){

        resultobj obj = new resultobj();
        obj.setWishlistItemID(100);
        obj.setUserName("myusername2");

        when(objServ.createWishlist(obj)).thenReturn(obj);
        objServ.removeWishlist(obj.getWishlistID());
    }


}
