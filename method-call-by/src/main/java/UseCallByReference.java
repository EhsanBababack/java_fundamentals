public class UseCallByReference {
    public static void main(String args[]){
        CallByReference cbr=new CallByReference();
        System.out.println("before change "+cbr.data);
        cbr.change(cbr) ; //passing object
        System.out.println("after change "+cbr.data);
    }
}
