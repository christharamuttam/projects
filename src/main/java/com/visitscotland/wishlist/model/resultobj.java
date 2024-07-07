package com.visitscotland.wishlist.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="resultobj")
public class resultobj {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer wishlistID;
    private  @NotBlank Integer  wishlistItemID;

    private  @NotBlank String userName;

    private String itemTitle;

    private String itemDescription;

    private String itemCategory;

    private String itemImage;

    private String itemDate;

    private String itemOtherInfo;

    public Integer getWishlistID() {
        return wishlistID;
    }

    public void setWishlistID(Integer wishlistID) {
        this.wishlistID = wishlistID;
    }

    public Integer getWishlistItemID() {
        return wishlistItemID;
    }

    public void setWishlistItemID(Integer wishlistItemID) {
        this.wishlistItemID = wishlistItemID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemDate() {
        return itemDate;
    }

    public void setItemDate(String itemDate) {
        this.itemDate = itemDate;
    }

    public String getItemOtherInfo() {
        return itemOtherInfo;
    }

    public void setItemOtherInfo(String itemOtherInfo) {
        this.itemOtherInfo = itemOtherInfo;
    }
}
