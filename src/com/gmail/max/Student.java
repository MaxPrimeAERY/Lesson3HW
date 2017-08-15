package com.gmail.max;

/**
 * Created by Maximus on 14.08.2017.
 */
public class Student extends Human {
    private String name;

    public Student(String name) {
        this.name = name;
    }
    public Student(){
        super();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
