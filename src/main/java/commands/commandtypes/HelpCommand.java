package commands.commandtypes;

import commands.commandprocesses.Command;
import commands.commandprocesses.Process;

public class HelpCommand implements Process{


    @Override
    public String process(Command command) {
        String helpList = "List of Commands : [greet,greeted,clear,help,exit]. \n Synopses \n" +
                "1. greet [name] [language] - Returns a greeting on the screen. \n " +
                "\t Name(required) : The name of user to greet. \n " +
                "\t Language : A language in which the user will be greeted in .\n" +
                "2. greeted - Returns the number of times a user has been greeted. \n " +
                "3. clear [name/ all] - Removes the count from database. \n" +
                " \t name : The name of the user to clear,clears every user if all is entered .\n" +
                "4. help - Prints out current screen. \n" +
                "5. exit - Exits the app. \n";
        return helpList;

    }
}