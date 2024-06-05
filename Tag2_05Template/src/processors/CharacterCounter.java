package processors;

public class CharacterCounter extends AbstractCharacterCounterHandler{


    @Override
    public void process(char c) {
        incrementCounter();
    }


}
