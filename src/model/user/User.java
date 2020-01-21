package model.user;

import java.util.ArrayList;
import java.util.List;

/**
 * User class 
 */
public class User {

    /**
     * Attributs
     */
    public String username;
    public String name;
    public String surname;
    public String password;
    public String mailAdress;
    public List<String> interests; 
    public List<User> users = new ArrayList<User>();

    /**
     * Constructor
     * 
     * @param username the username 
     * @param password the password
     */
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Generates a representation of the user
     */
    @Override
    public String toString() {
        return "User : " + this.getUsername() + " - Password : " + this.password;
    }

    /**
     * @return list of users
     */
    public List<User> getUserList() {
        return users;
    }

}