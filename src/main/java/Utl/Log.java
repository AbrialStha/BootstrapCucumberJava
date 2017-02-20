package Utl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by pav15p on 20/02/2017.
 * for logging the information
 */
public class Log {
    /**
     * Uninheritable final calss
     */
    private static Class<?> clazz;
    /**
     * private logger instance declaration
     */
    private static Logger logger;

    /**
     * Creating the generic type class constructor
     * @param clazz
     */
    public Log(Class<?> clazz) {
        Log.clazz = clazz;
        Log.logger = LoggerFactory.getLogger(Log.clazz);
    }

    /**
     * to log the message at the Info level
     * @param message
     * @return
     */
    public static void info(String message){
        logger.info(clazz.getCanonicalName() + ": " + message);
    }

    /**
     * to log the message at the error level
     * @param message
     */
    public static void error(String message) {
        logger.error(clazz.getCanonicalName() + ":" + message);
    }

    /**
     * to log the message at the trace level
     * @param message
     */
    public static void trace(String message) {
        logger.trace(clazz.getCanonicalName() + ": " + message);
    }

    /**
     * to log the message at the warn level
     * @param message
     */
    public static void warn(String message) {
        logger.warn(clazz.getCanonicalName() + ": " + message);
    }

}
