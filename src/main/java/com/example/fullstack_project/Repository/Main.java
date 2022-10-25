package com.example.fullstack_project.Repository;

public class Main {


  public static void main(String[] args) {

    DatabaseConnectManager.getConnection();

    WishlistRepositorie wr = new WishlistRepositorie();

    System.out.println(wr.getAllWishlist());
    System.out.println(wr.getWishlist(1));

  }
}
