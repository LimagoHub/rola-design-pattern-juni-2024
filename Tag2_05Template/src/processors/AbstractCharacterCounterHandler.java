package processors;

public abstract class AbstractCharacterCounterHandler implements CharacterHandler{
    private int counter = 0;

    @Override
    public void init() {
        counter = 0;
    }



    @Override
    public void dispose() {
        System.out.println(getClass().getSimpleName() + " " + counter);
    }

    protected void incrementCounter() {
        counter ++;
    }

}
