package math;

public class CalculatorFactory {

    private static boolean logger = false;
    private static boolean secure = false;

    public static boolean isLogger() {
        return logger;
    }

    public static void setLogger(boolean logger) {
        CalculatorFactory.logger = logger;
    }

    public static boolean isSecure() {
        return secure;
    }

    public static void setSecure(boolean secure) {
        CalculatorFactory.secure = secure;
    }

    public static Calculator create() {

        Calculator calculator = new CalculatorImpl();

        if(logger) calculator = new CalculatorLogger(calculator);
        if(secure) calculator = new CalculatorSecure(calculator);

        return calculator;


    }
}
