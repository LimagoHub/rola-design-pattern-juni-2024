package command;

public class CommandFactory {

    public static Command create(String zeile) {
        Command result = null;
        String [] tokens = zeile.split(" ");
        if(tokens[0].equals("Add")) {
            result = new AddCommand();
            result.parse(tokens);
        }
        if(tokens[0].equals("Print")) {
            result = new PrintCommand();
            result.parse(tokens);
        }
        return result;
    }
}
