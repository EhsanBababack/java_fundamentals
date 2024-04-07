package ir.co.sadad.solidprincipleproject.opencloseprinciple.correctmodel;

public class Base64Hasher implements PasswordHasher {
    @Override
    public String hashPassword(String password) {
        return "&quothashed with Base64&quot";
    }
}