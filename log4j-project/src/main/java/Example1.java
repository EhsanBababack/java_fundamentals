import org.apache.log4j.Logger;


public class Example1{

    final static Logger logger = Logger.getLogger(Example1.class);

    public static void main(String[] args) {

        Example1 obj = new Example1();
        obj.runMe("sematec");

    }

    private void runMe(String parameter){

        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + parameter);
        }

        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);

    }

}