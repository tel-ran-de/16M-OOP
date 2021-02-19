package de.telran.data;

public class User {
    private String firstname;
    private String lastname;
    private String email;
    private int age;
    private String occupation;
    private boolean registered;

    public User() {
    }

    public User(String firstname, String lastname, String email, int age, String occupation, boolean registered) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
        this.occupation = occupation;
        this.registered = registered;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public String toDisplay() {
        return "{" + "firstname " + firstname +
                "lastname " + lastname +
                "email " + email +
                "}";
    }
}
