package main;
import command.Command;
import command.CommandFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws Exception {

        Scanner sc = new Scanner(System.in);
        while(true) {
            String zeile;
            System.out.print("#>");
            zeile = sc.nextLine();
            if(zeile.equals("exit")) break;

            Command command = CommandFactory.create(zeile);
            if(command == null) continue;
            command.execute();

        }
    }
}