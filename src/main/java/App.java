import counter.Count;
import commands.Greeter;
import commands.HelpCommand;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Count counter = new Count();
        HelpCommand helpCommand =new HelpCommand();
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.print("Enter a command: ");
            String input = scan.nextLine();
            String[] inputArray = input.split(" ");
            if (inputArray.length < 1) {
            System.out.println("Please enter a command");
                continue;
            }
            String command = inputArray[0];
            if (command.equalsIgnoreCase("exit")) {
                break;
            }
            if (command.equalsIgnoreCase("help")){
                String helpList ="List of Commands : [greet,greeted,clear,help,exit]. " +
                        "1. greet [name] [language] - Returns a greeting on the screen. \n " +
                        "\t Name(required) : The name of user to greet. \n " +
                        "\t Language : A language in which the user will be greeted in .\n" +
                        "2. greeted - Returns the number of times a user has been greeted. \n " +
                        "3. clear [name/ all] - Removes the count from database. \n" +
                        " \t name : The name of the user to clear,clears every user if all is entered .\n" +
                        "4. help - Prints out current screen. \n" +
                        "5. exit - Exits the app. \n";
                System.out.println(helpList);
                continue;
            }
            if (command.equalsIgnoreCase("clear")){
                String remove = inputArray[1];
                if (remove.equalsIgnoreCase("all")){
                    counter.clearAllUsers();
                    System.out.println("All users have been cleared!");
                } else {
                    counter.clearUser(remove);
                    System.out.println(remove + " has been cleared from list of greeted users!");
                }
            }
                else if (command.equalsIgnoreCase("count")) {
                String countArg = inputArray[1];
                if (countArg.equalsIgnoreCase("all")) {
                    System.out.println(counter.getTotalUserCount() + " user(s) greeted!");
                } else
                    System.out.println(  countArg + " has been greeted " + counter.getUserCount(countArg) + " time(s).");
            }
            else if (command.equalsIgnoreCase("greet")) {
                    String name = inputArray[1];
                    String language = inputArray[2];

                    Greeter greeter = new Greeter(counter);

                    System.out.println(greeter.greet(name, language));

                } else {
                    System.out.println("please enter a command");
                }

            }
        }
}













