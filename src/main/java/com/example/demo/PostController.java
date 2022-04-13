package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

  @GetMapping("/post")
  public Post getPost() {
    return new Post(1, "Welcome to Java");
  }

  @PostMapping("/post")
  public Post createPost(@RequestBody Post post) {
    var id = post.getId();
    var title = post.getTitle();
    return new Post(id, title);
  }
}
