public class CallByReference {
    int data = 50;

    void change(CallByReference cbr) {
        cbr.data = cbr.data + 100 ; //changes will be in the instance variable
    }
}
