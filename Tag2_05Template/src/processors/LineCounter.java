package processors;

public class LineCounter extends AbstractCharacterCounterHandler{


    @Override
    public void process(char c) {
        if(c == '\n' )incrementCounter();
    }



}
