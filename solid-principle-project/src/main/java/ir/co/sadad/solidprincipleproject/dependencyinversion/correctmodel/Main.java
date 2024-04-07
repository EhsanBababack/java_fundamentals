package ir.co.sadad.solidprincipleproject.dependencyinversion.correctmodel;

public class Main {
    public static void main(String[] args) {
        Log logger = new Log();

        logger.setDatabase(new MongoDB());
// ...
        logger.setDatabase(new FileSystem());
// ...
        logger.setDatabase(new MySql());

        logger.update();
    }
}
