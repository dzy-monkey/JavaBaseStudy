package com.dongzhongyu.reflect;

public class User {
    public int a;
    public String adName;
    public int age;
    private int id;
    private String username;
    private String password;

    private User(int id) {
        this.id = id;
    }

    public User() {

    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public void show() {
        System.out.println(id + username + ":" + password);
    }

    public void Study() {
        System.out.println("学习");
    }

    public void Study(String courseName) {
        System.out.println(username + "正在学习" + courseName);
    }

    private void Study(int id, String username) {
        System.out.println(id + ":" + username);
    }
}
