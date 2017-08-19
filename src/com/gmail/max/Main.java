package com.gmail.max;

/**
 * Created by Maximus on 15.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Human hum1 = new Human("Petya", "Vasilenko", 23, true);
        System.out.println(hum1.toString());
        hum1 = new Student("Nikolay", "Novikov", 21, true, "33");
        System.out.println(hum1.toString());
        System.out.println();
        Group group = new Group();
        try {

            group.addStudent(new Student("Artem", "Melnilov", 20, true, "51"));
            group.addStudent(new Student("Irina", "Topoleva", 19, false, "55"));
            group.addStudent(new Student("Nikolay", "Novikov", 21, true, "33"));
            group.addStudent(new Student("Anna", "Kolomienko", 20, false, "53"));
        } catch (Except404 e) {
            System.out.println(e.getMessage());
        }
        System.out.println(group);
    }
}
