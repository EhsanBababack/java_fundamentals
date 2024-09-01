package org.example;

import java.lang.reflect.Field;

public class Validator {
    static void validate(Object obj) throws IllegalAccessException {
        Class<?> aClass = obj.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields){
            declaredField.setAccessible(true);
            Validate annotation = declaredField.getAnnotation(Validate.class);
            if (annotation != null){
                if (annotation.min() > (int)declaredField.get(obj) || annotation.max() < (int)declaredField.get(obj)){
                    System.out.println("eroooor");
                }
            }
        }
    }
}
