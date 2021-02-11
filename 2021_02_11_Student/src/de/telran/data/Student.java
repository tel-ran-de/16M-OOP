package de.telran.data;

public class Student {
    public String firstName;
    public String lastName;
    public int age;
    public double middleRating;

    static int count;
    public int studentID;

    public Student() {
        studentID = count;
        count++;
    }

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        studentID = count;
        count++;
    }
}
