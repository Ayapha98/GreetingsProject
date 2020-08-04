import commands.Command;
import commands.CommandType;
import commands.Greet;
import languages.Language;

import java.util.HashMap;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {




        Scanner scan = new Scanner(System.in);


        //  System.out.println(command);

//        String input  = {"greet Ayapha Swahili"};
        while(true){
            System.out.print("Enter a command: ");
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (parts.length<1){
                System.out.println("Please enter a command");
                continue;
            }
            String command = parts[0];


            if (command.equalsIgnoreCase("exit")) {
                break;
            }

             if (command.equalsIgnoreCase("greet")){
                 String name = parts[1];
                 String language = parts[2];

                 Greet greet = new Greet();
                 //greet.greet(name, language);
                System.out.println(greet.greet(name, language));

            } else {
                System.out.println("please enter a command");
            }

        }
    }
}



       /* while (true) {

            System.out.println(greet.greet(name, language));

            if (command.equalsIgnoreCase(greet.greet(name, language))){

            }
            else (command.equalsIgnoreCase("exit")) {
                break;
            }*/
            /*
            Do this in the loop
            1) get input from users
            2) split input into command, name, language
            3) check command
            4) if command.equalsIgnoreCase("exit") break;
             */
//            System.out.println(greet.greet(name, language));














