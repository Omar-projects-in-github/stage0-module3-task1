package school.mjc.stage0.module3.task1;

import java.util.logging.Logger;

public class PrintWordsApp {
    private static final Logger logger = Logger.getLogger(PrintWordsApp.class.getName());
    public static void main(String[] args) {
        logger.info("java" +
                        "\nis" +
                        "\nsmth");
        System.out.println("java" +
                        "\nis" +
                        "\nsmth");
    }
}
