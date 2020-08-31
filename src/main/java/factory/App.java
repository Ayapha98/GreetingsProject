package factory;

import commands.commandprocesses.CommandProcessor;
import commands.commandprocesses.GreetProcess;
import commands.commandprocesses.Greeter;
import commands.commandprocesses.Process;
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
        commandMap.put("greet",new GreetProcess(counter, greeter));
        CommandProcessor commandProcessor = new CommandProcessor(commandMap);


        while (true) {
            System.out.println("Enter a command : ");
            Output output = commandProcessor.process(scanner.nextLine());
            System.out.println(output.getResult());
            if (!output.getCommandOutput()) {
                break;
            }
        }
    }
}





































































