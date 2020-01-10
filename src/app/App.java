package app;

import java.util.ArrayList;
import java.util.List;

import user.User;

public class App {
    public static void main(String[] args) throws Exception {

        List<User> users = new ArrayList<>();

        User utilisateur = new User("username", "password");
        System.out.println(utilisateur.getUsername());

        System.out.println(utilisateur.toString());
        System.out.println(users);
    }
}