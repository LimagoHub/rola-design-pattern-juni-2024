package processors;

public class LineCounter extends FileProcessor{
    private int counter = 0;

    @Override
    public void init() {
        counter = 0;
    }

    @Override
    public void process(char c) {
        if(c == '\n' )counter ++;
    }

    @Override
    public void dispose() {
        System.out.println(counter);
    }

}
