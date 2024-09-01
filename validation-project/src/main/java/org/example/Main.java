package org.example;


public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        MyEntity entity = new MyEntity(100 , 12);
        Validator.validate(entity);
    }
}