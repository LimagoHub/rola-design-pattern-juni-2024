package main;

import processors.CharacterCounter;
import processors.FileCopy;
import processors.FileProcessor;
import processors.LineCounter;

public class Main {
    public static void main(String[] args) {

        FileProcessor processor = new FileCopy();
        processor.run("./resource/eingabe.txt");
    }
}