package de.telran.application;

import de.telran.data.Student;

/**
 * 16M-OOP
 * 11 11 : 49
 */
public class StartMyLovelyApplication {
    public static void main(String[] args) {
        Student vasyaPupkin = new Student();
        Student sergej = new Student();
        Student varvara = new Student();
        Student afdofia = new Student(
                "Афдофья",
                "Ивановна",
                18);
        System.out.println(vasyaPupkin.studentID);
        System.out.println(afdofia.studentID);
    }
}
