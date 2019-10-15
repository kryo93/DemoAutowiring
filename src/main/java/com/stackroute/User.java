package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User
{
    private int age;
    private String firstName;
    private String lastName;
    @Autowired   // it will start searching for a object of usermobile in spring container else we get a null pointer exception as it wont know where to search this in spring even though bean is created
    private UserMobile userMobile;
    // there is a qualifier which searches by name auto wire search by class

    public UserMobile getUserMobile() {
        System.out.println(userMobile.toString());
        return userMobile;
    }

    public void setUserMobile(UserMobile userMobile) {
        this.userMobile = userMobile;
    }

    public User() {
        System.out.println("mera object ghar aaya ho raam ji");
    }

    public User(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void show()
    {
        System.out.println("yo nibba");
    }
}
