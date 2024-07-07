package com.visitscotland.wishlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class WishlistApplication {

	public static void main(String[] args) {
		SpringApplication.run(WishlistApplication.class, args);
	}

}
