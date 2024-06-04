package main;
import command.Command;
import command.CommandFactory;
import command.CommandHistory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws Exception {

        final CommandHistory history = new CommandHistory();
        Scanner sc = new Scanner(System.in);
        while(true) {
            String zeile;
            System.out.print("#>");
            zeile = sc.nextLine();
            if(zeile.equals("exit")) break;
            if(zeile.equals("undo")) {
                history.undo();
                continue;
            }
            if(zeile.equals("redo")) {
                history.redo();
                continue;
            }
            Command command = CommandFactory.create(zeile);
            if(command == null) continue;
            command.execute();
            history.add(command);

        }
    }
}