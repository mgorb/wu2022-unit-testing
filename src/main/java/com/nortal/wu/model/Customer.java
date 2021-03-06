package com.nortal.wu.model;

import java.util.UUID;

public class Customer {

  private final UUID id;
  private final String firstName;
  private final String lastName;
  private final int age;

  public Customer(UUID id, String firstName, String lastName, int age) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public UUID getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }
}
