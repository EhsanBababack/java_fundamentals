package org.example;

import java.util.function.UnaryOperator;

class MyOperator implements UnaryOperator<String> {

    @Override

    public String apply(String s) {

        return "// "+s+" //";

    }

}