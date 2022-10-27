package com.example.fullstack_project.Model;

public class Wishlist {

  private int id;
  private String name;
  private String name2;
  private String name3;
  private String name4;

 public Wishlist(int id, String name, String name2, String name3,String name4){
    this.id = id;
    this.name = name;
   this.name2 = name2;
   this.name3 = name3;
   this.name4 = name4;

  }

  public Wishlist(String name, String name2, String name3,String name4){
    this.name = name;
    this.name2 = name2;
    this.name3 = name3;
    this.name4 = name4;


  }



  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getName2() {
    return name2;
  }

  public String getName3() {
    return name3;
  }

  public String getName4() {
    return name4;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setName2(String name2) {
    this.name2 = name2;
  }
  public void setName3(String name3) {
    this.name3 = name3;
  }
  public void setName4(String name4) {
    this.name4 = name4;
  }

  @Override
  public String toString() {
    return "Wishlist{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", name2='" + name2 + '\'' +
        ", name3='" + name3 + '\'' +
        ", name4='" + name4 + '\'' +
        '}';
  }
}

