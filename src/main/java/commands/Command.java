package commands;

public class Command {

    private String[] inputArray;

// Constructor
    public Command(String input){
    this.inputArray = input.split(" ");
    }

//     what is this method doing ??

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
        if (validateCommand(this.inputArray[0])){
            return inputArray[0];
        }
        return "Invalid command";
    }

//    get the name entered in command and Change first letter to UpperCase

    public String getName(){
        if (this.inputArray.length >= 2) {
            String name = inputArray[1].toLowerCase();
            name = name.replace(name.charAt(0),Character.toUpperCase(name.charAt(0)));
            return name;
        }
        return null;
    }

//    get Language

    public String getLanguage(){
        if (this.inputArray.length == 3){
            return this.inputArray[2];
        }
        return null;
    }

}
