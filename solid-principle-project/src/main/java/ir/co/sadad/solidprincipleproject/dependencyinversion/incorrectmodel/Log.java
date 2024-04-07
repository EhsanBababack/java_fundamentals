package ir.co.sadad.solidprincipleproject.dependencyinversion.incorrectmodel;

class Log {
    private MySql database;

    void constructor() {
        this.database = new MySql();
    }
}