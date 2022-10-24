package com.example.fullstack_project.Model;

public class Wishlist {

  private int id;
  private String name;

 public Wishlist(int id, String name){
    this.id = id;
    this.name = name;
  }

  public Wishlist( String name){
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Wishlist{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
