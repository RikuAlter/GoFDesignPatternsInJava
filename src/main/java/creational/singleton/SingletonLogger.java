package creational.singleton;

public class SingletonLogger {
    private static volatile SingletonLogger logger;
    private String name;

    private SingletonLogger(String name) {
        this.name = name;
    }

    public static SingletonLogger getInstance(String name) {
        if (logger == null) {
            synchronized (SingletonLogger.class) {
                if (logger == null) {
                    logger = new SingletonLogger(name);
                }
            }
        }
        return logger;
    }
}
