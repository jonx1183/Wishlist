package com.example.fullstack_project.Service;

import com.example.fullstack_project.Model.Wishlist;
import com.example.fullstack_project.Repository.WishlistRepositorie;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

public class WishlistService {

  WishlistRepositorie repo = new WishlistRepositorie();

  public List<Wishlist> getAllWishlist() {

    return repo.getAllWishlist();
  }

  public Wishlist getWishlist (int id){
    return repo.getWishlist(id);

  }


  public void wishlist(WebRequest req) {
    Wishlist wishlist2 = new Wishlist(req.getParameter("name"));


    repo.createWishlist(wishlist2);
  }

}