package commands.commandprocesses;

public class Command {

    private String[] userInput;

// Constructor
    public Command(String input){
    this.userInput = input.split(" ");
    }


    private boolean validateCommand(String commandIn){
        for (CommandType command : CommandType.values()) {
            if (command.name().equals(commandIn.toUpperCase())) {
                return true;
            }
        }
        return false;
    }

//    check that a command has been entered and return an error message

    public String getCommand(){
        if (validateCommand(this.userInput[0])){
            return userInput[0];
        }
        return "Invalid command";
    }

//    get the name entered in command and Change first letter to UpperCase

    public String getName(){
        if (this.userInput.length >= 2) {
            String name = userInput[1].toLowerCase();
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            return name;
        }
        return null;
    }

    public String getLanguage(){
        if (this.userInput.length == 3) {
            return this.userInput[2];
        }
        return null;
    }

}
