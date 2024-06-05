package iterators;

import java.util.Iterator;
import java.util.Scanner;

public class ConsoleIterator implements Iterator<String> {
    private Scanner scanner = new Scanner(System.in);
    private String nextValue;
    @Override
    public boolean hasNext() {
        System.out.print("#>");
        return ! scanner.hasNext("ende");

    }

    @Override
    public String next() {
        return scanner.next();
    }
}
