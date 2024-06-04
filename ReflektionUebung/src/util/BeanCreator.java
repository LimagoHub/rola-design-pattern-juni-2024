package util;

import java.lang.reflect.Method;
import java.util.Scanner;

public class BeanCreator {

    private static final String PREFIX = "set";
    public Object createAndFillBean(String fullQualifiedClassName){
        try (Scanner scanner = new Scanner(System.in)){
            Object result = Class.forName(fullQualifiedClassName).getConstructor().newInstance();
            Method[] methods = result.getClass().getDeclaredMethods();
            for(Method method : methods){
                if(method.getName().startsWith(PREFIX)){
                    System.out.println("Bitte Wert fuer " + method.getName().substring(PREFIX.length()) + " eingeben:");
                    method.invoke(result, scanner.nextLine());
                }

            }

            return result;
        } catch (Throwable e) {
            return null;
        }
    }
}
