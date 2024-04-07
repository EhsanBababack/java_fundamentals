package ir.co.sadad.solidprincipleproject.opencloseprinciple.correctmodel;

public class MD5Hasher implements PasswordHasher {
    @Override
    public String hashPassword(String password) {
        return "&quothashed with MD5&quot";
    }
}