package commands.commandtypes;

import commands.commandprocesses.Command;
import commands.commandprocesses.Process;
import counter.Counter;

public class ClearProcessor implements Process {

    private Counter counter;
    public ClearProcessor(Counter counter){
        this.counter = counter;
    }


    @Override
    public String process(Command command) {
        if (command.getName() != null) {
            if (counter.clearUser(command.getName())) {
                return "User: " + command.getName() + " cleared successfully";
            }
            return "User " + command.getName() + " does not exist";
        }
        if (counter.clearAllUsers()) {
            return "All users cleared successfully";
        }
        return "Error";
    }
}
