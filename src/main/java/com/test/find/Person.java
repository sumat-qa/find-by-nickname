package com.test.find;

public class Person {

  private String nickname;
  private String email;

  public Person(){}

  public Person(String nickname, String email){
    this.nickname = nickname;
    this.email = email;
  }

  public String getNickname(){
    return nickname;
  }

  public String getEmail(){
    return email;
  }

}
