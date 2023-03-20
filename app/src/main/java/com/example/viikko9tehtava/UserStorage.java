package com.example.viikko9tehtava;

import java.util.ArrayList;

public class UserStorage {

    private static UserStorage userStorage = null;

    private ArrayList<User> Users = new ArrayList<>();


    public UserStorage() {

    }


    public static UserStorage getInstance() {
        if (userStorage == null) {
            userStorage = new UserStorage();
        }
        return userStorage;
    }

    public void addUser(User user) {
        Users.add(user);
    }

    public ArrayList<User> getUsers() {
        return Users;
    }
}
