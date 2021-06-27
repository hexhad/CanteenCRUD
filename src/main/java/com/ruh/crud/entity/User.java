package com.ruh.crud.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    /*
    * to generate getters setters Constructors
    * Alt + Insert
    * */


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "approve")
    private Integer approve;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private Integer mobile;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private Integer type;

    public User(){}

    public User(Integer id, String name, String password, Integer type) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
