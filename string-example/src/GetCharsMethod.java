public class GetCharsMethod {
    public static void main(String[] args) {
        String str="Hello, my name is Mehdi. I'm a teacher.";

        char[] chars=new char[10];

        str.getChars(7,12,chars,2);

        for(char ch:chars){

            System.out.print(ch+"\t");

        }
    }
}
