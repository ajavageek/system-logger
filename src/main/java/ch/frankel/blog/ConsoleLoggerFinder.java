package ch.frankel.blog;

import java.util.HashMap;
import java.util.Map;

public class ConsoleLoggerFinder extends System.LoggerFinder {

    private static final Map<String, ConsoleLogger> LOGGERS = new HashMap<>();

    @Override
    public System.Logger getLogger(String name, Module module) {
        return LOGGERS.computeIfAbsent(name, ConsoleLogger::new);
    }
}
