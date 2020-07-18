import commands.Greet;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter language and name: ");
        String language = scan.nextLine();
        String name = scan.nextLine();
        Greet greet = new Greet();

       System.out.println(greet.executeCommand());











        /*Greet greet = new Greet();
        System.out.println(greet.executeCommand(new String[] {"Ayapha", "Swahili"}));
        System.out.println(greet.executeCommand(new String[] {"Ayapha", "English"}));
        System.out.println(greet.executeCommand(new String[] {"Ayapha", "Isixhosa"}));*/
    }
}
