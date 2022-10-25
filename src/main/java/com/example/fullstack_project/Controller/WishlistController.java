package com.example.fullstack_project.Controller;


import com.example.fullstack_project.Model.Wishlist;
import com.example.fullstack_project.Service.WishlistService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class WishlistController {

  WishlistService service = new WishlistService();

  @GetMapping("/")
  public List<Wishlist> index() {

    return service.getAllWishlist();

  }

  @GetMapping ("wish")
  public Wishlist getWishlist (@RequestParam int id) {
    return service.getWishlist(id);
  }





}
