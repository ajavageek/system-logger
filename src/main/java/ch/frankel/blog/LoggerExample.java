package ch.frankel.blog;

import static java.lang.System.Logger.Level.DEBUG;
import static java.lang.System.Logger.Level.INFO;

public class LoggerExample {

    private static final System.Logger LOGGER = System.getLogger("ch.frankel.blog.DefaultLogger");

    public static void main(String[] args) {
        LOGGER.log(DEBUG, "A debug message");
        LOGGER.log(INFO, "Hello world!");
    }
}
