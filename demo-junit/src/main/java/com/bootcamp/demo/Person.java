package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {
  private int age;
  private String name;

  public boolean isAdult() {
    return this.age >= 18;
  }
}
