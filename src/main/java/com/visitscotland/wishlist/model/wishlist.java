package com.visitscotland.wishlist.model;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="wishlist")
public class wishlist implements Serializable {


    public wishlist() {
    }


    public wishlist(String user, Integer itemId) {
        //this.id = id;
        this.user = user;
        this.itemId = itemId;
    }

/*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
*/
    @Id
    private  @NotBlank String user;



    private  @NotBlank Integer itemId;


    @OneToMany (fetch =FetchType.EAGER)
    @JoinColumn( name="user", referencedColumnName="user")
    public Set<item> Itemlist;

    public Set<item> getItemlist(){
        return Itemlist;
    };

    public String getUser() {
        return user;
    }


    public void setUser(String user) {
        this.user = user;
    }




    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
/*
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    */

}


