package com.example.fullstack_project.Controller;


import com.example.fullstack_project.Model.Wishlist;
import com.example.fullstack_project.Service.WishlistService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@RestController
public class WishlistController {
  WishlistService service = new WishlistService();

  @GetMapping("/")
  public List<Wishlist> index() {

    return service.getAllWishlist();

  }

  @GetMapping ("/wishlist")
  public Wishlist getWishlist (int id) {
    return service.getWishlist(id);
  }

  @PostMapping("/wishlist")
  public void wishlist(WebRequest req) {
    service.wishlist(req);
    System.out.println(req.getParameter("id"));
    System.out.println(req.getParameter("name"));

    }

}
