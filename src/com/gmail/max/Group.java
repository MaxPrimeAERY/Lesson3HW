package com.gmail.max;

/**
 * Created by Maximus on 15.08.2017.
 */
public class Group extends Student {
    Student[] groupStudent = new Student[10];

    private String lastName;

    public Group() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addStudent(Student numberStud) throws Except404 {
        if (numberStud == null) {
            throw new IllegalArgumentException("Null student");
        }
        for (int i = 0; i < groupStudent.length; i++) {
            if (groupStudent[i] == null) {
                groupStudent[i] = numberStud;
                return;
            }
        }
        throw new Except404();
    }

    public void deleteStudent(int i) {
        if (!(i >= 0 && i < groupStudent.length)) {
            System.out.println("Error index");
            return;
        }
        groupStudent[i] = groupStudent[i + 1];
    }

    public void sort() {
        for (int i = 0; i < groupStudent.length - 1; i++) {
            for (int j = i + 1; j < groupStudent.length; j++) {
                if (compareStudent(groupStudent[i], groupStudent[j]) > 0) {
                    Student temp = groupStudent[i];
                    groupStudent[i] = groupStudent[j];
                    groupStudent[j] = temp;
                }
            }
        }
    }

    private int compareStudent(Student a, Student b) {
        if (a != null && b == null) {
            return 1;
        }
        if (a == null && b != null) {
            return -1;
        }
        if (a == null && b == null) {
            return 0;
        }
        return a.getLastname().compareTo(b.getLastname());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        sort();
        for (Student student : groupStudent) {
            if (student != null) {
                sb.append((++i) + ") ").append(student);
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
