package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class EnsureCapacityMethod {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.addAll(Arrays.asList("mehdi","ahmad","negin","zahra","mehran"));

        names.ensureCapacity(1000);
    }
}