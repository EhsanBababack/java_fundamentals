

public class OuterClass {
    private String name;
    public int age = 31;
    public OuterClass(String name) {
        this.name = name;
    }
    public class MemberInnerClass {
        public int height = 190;

        public void innerMethod(String lastName) {
            System.out.println("name is : " + name + lastName + " age is : " + age + " height is : " + height);
        }
    }
    public MemberInnerClass createMemberInnerClassInstance(){
        return this.new MemberInnerClass();
    }
}
