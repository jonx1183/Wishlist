package com.example.fullstack_project.Repository;

import com.example.fullstack_project.Model.Wishlist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WishlistRepositorie {

  private Connection conn = DatabaseConnectManager.getConnection();


  public List<Wishlist> getAllWishlist() {
    List<Wishlist> wishlist = new ArrayList<>();

    try{
      PreparedStatement psts = conn.prepareStatement("SELECT * FROM wish.wishliste");
      ResultSet resultSet = psts.executeQuery();

      while(resultSet.next()){
        wishlist.add(new Wishlist(
            resultSet.getInt("id"),
            resultSet.getString("name")
        ));
      }

    }catch (SQLException e){
      System.out.println("Error at getAllWishlists");
      e.printStackTrace();
    }
    return wishlist;
  }

public Wishlist getWishlist(int id){
try {
  PreparedStatement psts = conn.prepareStatement("SELECT * FROM wish.wishliste WHERE id =?");
  psts.setInt(1,id);
  ResultSet resultSet = psts.executeQuery();
}catch (SQLException e){
  System.out.println("Error at getWishlist");
  e.printStackTrace();
}
return null;
  }

public void createWishlist(Wishlist wishlist){
    try{
      PreparedStatement psts = conn.prepareStatement("INSERT INTO wish.wishliste (id, name) VALUES (?,?)");
      psts.setInt(1,wishlist.getId());
      psts.setString(2, wishlist.getName());
      psts.executeUpdate();
    }catch (SQLException e){
      System.out.println("Error at createWishlist");
      e.printStackTrace();
    }
}


}
