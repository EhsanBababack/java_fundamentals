package ir.co.sadad.solidprincipleproject.dependencyinversion.correctmodel;

class Log {
    private Database db;

    public Database setDatabase(Database db) {
        this.db = db;
        return db;
    }

    public void update() {
        this.db.update();
    }
}