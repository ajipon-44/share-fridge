package com.sharefridge.backend.service;

import org.springframework.stereotype.Service;

import com.sharefridge.backend.model.HelloResponse;
import com.sharefridge.backend.repository.HelloRepository;

@Service
public class HelloService {
  // private final HelloRepository helloRepository;

  // public HelloService(HelloRepository helloRepository) {
  //   this.helloRepository = helloRepository;
  // }

  public HelloResponse getHelloMessage() {
    return new HelloResponse("hello");
  }
}
