package com.example.demo;

public class Post {

  private final long id;
  private String title;

  public Post(long id, String title) {
    this.id = id;
    this.title = title;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }
}
