import org.apache.log4j.Logger;

public class Example2 {

    final static Logger logger = Logger.getLogger(Example2.class);

    public static void main(String[] args) {

        Example2 obj = new Example2();

        try{
            obj.divide();
        }catch(ArithmeticException ex){
            logger.error("Sorry, something wrong!", ex);
        }


    }

    private void divide(){

        int i = 10 /0;

    }

}