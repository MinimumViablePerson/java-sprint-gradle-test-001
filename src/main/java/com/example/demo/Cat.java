package com.example.demo;

import org.springframework.lang.NonNull;

public class Cat {
  public String name;
  public String breed;
  public Integer age;
  public Boolean hungry;

  public Cat(String name, String breed, Integer age) {
    this.name = name;
    this.breed = breed;
    this.age = age;
    this.hungry = true;
  }

}
