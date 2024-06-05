package processors;

import java.util.*;
import java.io.FileReader;


public class FileProcessor {

    private List<CharacterHandler> handlers = new ArrayList<>();

    public void addCharacterHandler(CharacterHandler handler) {
        handlers.add(handler);
    }

    public void removeCharacterHandler(CharacterHandler handler) {
        handlers.remove(handler);
    }


    public final void run(String filename) {
        try (FileReader reader = new FileReader(filename)){
            init();
            int c;
            while ((c = reader.read()) != -1) {
               process((char) c);
            }
            dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void init() {
        handlers.forEach(h->h.init());
    }

    private void process(char c){
        handlers.forEach(h->h.process(c));
    }

    public void dispose() {
        handlers.forEach(h->h.dispose());
    }
}
