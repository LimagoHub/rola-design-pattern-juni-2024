package processors;

import java.io.FileWriter;
import java.io.IOException;

public class FileCopy implements CharacterHandler {

    private FileWriter writer = null;

    @Override
    public void init() {
        try {
            writer = new FileWriter("./resource/aus.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void process(char c) {
        try {
            writer.write(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void dispose() {
        try {
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
