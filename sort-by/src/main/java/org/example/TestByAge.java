package org.example;

import java.util.Arrays;

public class TestByAge {
    public static void main(String[] args) {
        Human[] humans = {
                new Human("sara",25),
                new Human("ehsan",32),
                new Human("ali",15),
                new Human("kalim",42),
                new Human("maya",28),
                new Human("tara",19)
        };
        Arrays.sort(humans,new AgeComparator());
        for (Human human:humans){
            System.out.println("[" + human.getName() + "," +human.getAge()+"]");
        }
    }
}