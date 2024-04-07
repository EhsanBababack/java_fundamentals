package ir.co.sadad.solidprincipleproject.opencloseprinciple.incorrectmodel;

import static ir.co.sadad.solidprincipleproject.opencloseprinciple.incorrectmodel.HashingType.*;

public class PasswordHasher {
    public String hashedPassword;

    public String hashPassword(String password, HashingType hashingType) {
        if (HashingType.values().equals(Base64)) {
            hashedPassword = "&quothashed with Base64&quot";
        } else if (HashingType.values().equals(MD5)) {
            hashedPassword = "&quothashed with MD5&quot";
        }
        return hashedPassword;
    }
}
