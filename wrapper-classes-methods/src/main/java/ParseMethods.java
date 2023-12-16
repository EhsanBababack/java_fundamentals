public class ParseMethods {
    public static void main(String[] args) {
        Double dx = Double.parseDouble("12.957899");
        Integer ix = Integer.parseInt("456");
        Short sx = Short.parseShort("14");
        Long lx = Long.parseLong("78878548646468");
        Byte bx = Byte.parseByte("56");
        Float fx = Float.parseFloat("12.3584");
        System.out.println(dx.getClass().getName());
        System.out.println(ix.getClass().getName());
        System.out.println(sx.getClass().getName());
        System.out.println(lx.getClass().getName());
        System.out.println(bx.getClass().getName());
        System.out.println(fx.getClass().getName());
    }
}
