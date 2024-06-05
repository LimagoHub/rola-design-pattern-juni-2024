package processors;

import java.util.ArrayList;
import java.util.List;

public class CombiendProcessor implements CharacterHandler{

    private List<CharacterHandler> handlers = new ArrayList<>();

    public void addCharacterHandler(CharacterHandler handler) {
        handlers.add(handler);
    }

    public void removeCharacterHandler(CharacterHandler handler) {
        handlers.remove(handler);
    }


    @Override
    public void init() {
        handlers.forEach(h->h.init());
    }

    @Override
    public void process(char c) {
        handlers.forEach(h->h.process(c));
    }

    @Override
    public void dispose() {
        handlers.forEach(h->h.dispose());
    }
}
