public class DeleteCharAtMethod {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("my name is Ehsan.");
        sb1.deleteCharAt(2);
        sb1.deleteCharAt(5);
        System.out.println(sb1);
    }
}
