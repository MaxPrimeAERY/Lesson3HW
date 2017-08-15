package com.gmail.max;

/**
 * Created by Maximus on 15.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Human hum1 = new Human(20, 80, true, "Petya");
        Student stud1 = new Student();
        System.out.println(hum1.toString());
        hum1 = new Student("Nikolay");
        System.out.println(hum1.toString());
    }
}
