package commands.commandprocesses;

import factory.Output;

import java.util.Map;

public class CommandProcessor {
    private Map<String, Process> commandMap;

    public CommandProcessor(Map<String, Process> commandMap) {
        this.commandMap = commandMap;
    }

    public Output process(String commandString) {
        Command command = new Command(commandString);
        if (commandMap.containsKey(command.getCommand())) {
            Process commandProcess = commandMap.get(command.getCommand());
            if (!command.getCommand().equals("exit")) {
                return new Output(commandProcess.process(command), true);
            }
            return new Output(commandProcess.process(command), false);
        }
        return new Output("Please enter a valid command!g\n Enter 'help' for list of valid commands \n", true);
    }



}
