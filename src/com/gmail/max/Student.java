package com.gmail.max;

/**
 * Created by Maximus on 14.08.2017.
 */
public class Student extends Human {
    private String group;

    public Student(String name, String lastname, int age, boolean sex, String group) {
        super(name, lastname, age, sex);
        this.group = group;
    }

    public Student() {
        super();
    }


    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student [group=" + group + "]" + super.toString();
    }
}
