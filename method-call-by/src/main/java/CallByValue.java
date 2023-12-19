public class CallByValue {
    int data = 50;

    void change(int data) {
        data = data + 100 ; //changes will be in the local variable only
    }
}
