public class Adder {
    private int number ;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Adder add(int i){
        this.number+=i;
        return this ;
    }

    void print(){
        System.out.println(this.number);
    }
}
