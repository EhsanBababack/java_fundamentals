public class SetCharAtMethod {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("my name is mehdi.");
        sb1.setCharAt(3,'N');
        sb1.setCharAt(0,'M');
        System.out.println(sb1);
    }
}
