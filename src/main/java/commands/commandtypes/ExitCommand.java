package commands.commandtypes;

import commands.commandprocesses.Command;
import commands.commandprocesses.Process;

public class ExitCommand implements Process {
    @Override
    public String process(Command command) {
        return "Goodbye!";
    }
}
