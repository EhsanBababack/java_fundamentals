public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass("Ehsan");
        OuterClass.MemberInnerClass innerClass = outerClass.createMemberInnerClassInstance();
        innerClass.innerMethod("Bababack");
    }
}
