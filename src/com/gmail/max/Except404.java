package com.gmail.max;

/**
 * Created by Maximus on 15.08.2017.
 */
public class Except404 extends Exception {
    public String getMessage(){
        return "Student doesn't exist";
    }
}
