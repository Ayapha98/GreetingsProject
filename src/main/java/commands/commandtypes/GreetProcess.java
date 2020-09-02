package commands.commandtypes;


import commands.commandprocesses.Command;
import commands.commandprocesses.Process;
import counter.Counter;

public class GreetProcess implements Process {
    private Counter counter;
    private Greeter greeter;

    public GreetProcess(Counter counter, Greeter greeter){
        this.counter = counter;
        this.greeter = greeter;
    }


    @Override
    public String process(Command command) {
        if (command.getName() == null) {
            return "Please enter your name after the greet command.";
        }
        counter.countUser(command.getName());
        return greeter.greet(command.getName(), command.getLanguage());
    }
}
