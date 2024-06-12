package Wiproj_Maven.Wiproj_Maven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class MyApp {

    private static final Logger logger = LoggerFactory.getLogger(MyApp.class);

    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.run();
    }

    public void run() {
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");

        try {
            int result = divide(10,2);
        } catch (ArithmeticException e) {
            logger.error("Exception occurred: ", e);
        }
    }

    public int divide(int a, int b) {
        return a / b;
    }
}



