package com.gmail.max;

/**
 * Created by Maximus on 14.08.2017.
 */
public class Human {

    private int age;
    private double weight;
    private boolean sex;
    private String name;

    public Human(int age, double weight, boolean sex, String name) {
        this.age = age;
        this.weight = weight;
        this.sex = sex;
        this.name = name;
    }

    public Human() {
        super();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", weight=" + weight +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                '}';
    }
}
