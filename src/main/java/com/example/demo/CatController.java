package com.example.demo;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

  @GetMapping("/cat")
  public Cat cat(
      @RequestParam String name,
      @RequestParam String breed,
      @RequestParam Integer age) {
    return new Cat(name, breed, age);
  }

  @PostMapping("/cat")
  public Cat createCat(@RequestBody @Validated Cat cat) {
    return new Cat(cat.name, cat.breed, cat.age);
  }

  @PatchMapping("/cat/{id}")
  public Cat updateCat(@RequestBody Cat cat) {
    return new Cat(cat.name, cat.breed, cat.age);
  }

}
