package de.telran.dao;

import de.telran.data.User;

public class Group {
    private User[] users; // автобус на 45 человек
    private int size;  // сколько человек ЗОПЛОТИЛО

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";


    public Group(int capacity) {
        users = new User[capacity];
        size = 0;
    }


    public boolean addUser(User user) {
        if (size < users.length) {
            users[size] = user;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteUser(User user) {
        for (int i = 0; i < size; i++) {
            if (users[i].equals(user)) {
                users[i] = users[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public String toDisplay() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += users[i].toDisplay() + ", \n";
        }
        return result;
    }
}