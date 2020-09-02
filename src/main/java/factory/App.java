package factory;

import commands.commandprocesses.CommandProcessor;
import commands.commandprocesses.Process;
import commands.commandtypes.*;
import counter.Count;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Greeter greeter = new Greeter();
        Count counter = new Count();

        Map<String, Process> commandMap = new HashMap<>();
        commandMap.put("greet", new GreetProcess(counter, greeter));
        commandMap.put("count", new CountProcessor(counter));
        commandMap.put("clear", new ClearProcessor(counter));
        commandMap.put("help", new HelpCommand());
        commandMap.put("exit", new ExitCommand());
        CommandProcessor commandProcessor = new CommandProcessor(commandMap);


        while (true) {
            System.out.print("Enter a command : ");
            Output output = commandProcessor.process(scanner.nextLine());
            System.out.println(output.getResult());
            if (!output.getCommandOutput()) {
                break;
            }
        }
    }
}





































































