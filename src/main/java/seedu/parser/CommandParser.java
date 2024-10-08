package seedu.parser;

import seedu.command.AddCommand;
import seedu.command.DeleteCommand;
import seedu.command.ExitCommand;
import seedu.model.Inventory;
import seedu.ui.Ui;

public class CommandParser {
    public static void parseCommand(String input, Inventory inventory, Ui ui) throws Exception {
        String[] parts = input.split(" ", 3);
        String command = parts[0];

        switch (command) {
        case "add":
            new AddCommand(inventory, ui).execute(parts);
            break;
        case "delete":
            DeleteCommand.execute(input, inventory);
            break;
        case "exit":
            new ExitCommand(ui).execute();
            break;
        default:
            throw new Exception("Unknown command");
        }
    }
}
