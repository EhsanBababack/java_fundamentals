package org.example;

public class MyEntity {
    @Validate(min = 10, max = 20)
    private int i;
    @Validate(min = 40, max = 50)
    private int j;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public MyEntity(int j, int i) {
        this.j = j;
        this.i = i;
    }
}
