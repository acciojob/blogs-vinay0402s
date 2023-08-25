package com.driver.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table

public class User {

    @Id//for primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //generate automatic value;
    private Integer userId;

    private String userName;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Blog> blogList = new ArrayList<>();

    public User(){

    }

    public User(Integer userId, String userName, String password, String firstName, String lastName, List<Blog> blogList) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.blogList = blogList;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }
}