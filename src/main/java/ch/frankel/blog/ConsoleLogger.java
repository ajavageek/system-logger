package ch.frankel.blog;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class ConsoleLogger implements System.Logger {

    private final String name;

    public ConsoleLogger(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isLoggable(Level level) {
        return level.getSeverity() >= Level.INFO.getSeverity();
    }

    @Override
    public void log(Level level, ResourceBundle bundle, String msg, Throwable thrown) {
        if (isLoggable(level)) {
            System.out.println(msg);
            thrown.printStackTrace();
        }
    }

    @Override
    public void log(Level level, ResourceBundle bundle, String format, Object... params) {
        if (isLoggable(level)) {
            System.out.println(MessageFormat.format(format, params));
        }
    }
}
