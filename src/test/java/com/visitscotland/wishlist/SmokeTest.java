package com.visitscotland.wishlist;

import com.visitscotland.wishlist.controller.ItemController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SmokeTest {


    @Autowired
    private ItemController itemController;

    @Test
    void contextLoads() throws Exception {
        assertThat(itemController).isNotNull();
    }
}
