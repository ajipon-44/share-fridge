package com.sharefridge.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharefridge.backend.model.HelloResponse;
import com.sharefridge.backend.service.HelloService;

@RestController
public class HelloController {
  private final HelloService helloService;

  public HelloController(HelloService helloService) {
    this.helloService = helloService;
  }

  @GetMapping("/")
  public HelloResponse hello() {
    return helloService.getHelloMessage();
  } 
}
