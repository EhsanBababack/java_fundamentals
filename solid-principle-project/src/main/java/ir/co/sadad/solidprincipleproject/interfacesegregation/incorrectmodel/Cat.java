package ir.co.sadad.solidprincipleproject.interfacesegregation.incorrectmodel;

class Cat implements Animal {

    @Override
    public void fly() {
//         FALSE
//         CAT CANT FLY
    }

    @Override
    public void run() {
//          RUN
    }

    @Override
    public void eat() {
//          RUN
    }
}