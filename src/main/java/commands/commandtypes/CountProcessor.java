package commands.commandtypes;

import commands.commandprocesses.Command;
import commands.commandprocesses.Process;
import counter.Counter;

public class CountProcessor implements Process {

    private Counter counter;

    public CountProcessor(Counter counter){
        this.counter = counter;
    }

    @Override
    public String process(Command command) {
        if (command.getName() != null) {
            return   command.getName() + " has been greeted " + counter.getUserCount(command.getName()) + " time(s).";
        }
        return counter.getTotalUserCount() + " users have been greeted!";
    }
}
