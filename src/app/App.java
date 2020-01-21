package app;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {

        /*List<User> users = new ArrayList<>();

        User utilisateur = new User("username", "password");
        System.out.println(utilisateur.getUsername());

        System.out.println(utilisateur.toString());
        System.out.println(users);*/

        JFrame frame = new JFrame("Balade en Ville");
        //AuthenticationPanel authenticationPanel = new AuthenticationPanel();
        frame.setSize(700, 600);
        //frame.add(authenticationPanel);
        frame.setVisible(true);
        
    }
}