package commands;

import java.util.HashMap;

import static languages.Language.*;


public class Greet {

    HashMap<String,Integer> names = new HashMap<String,Integer>();

    public String greet(String name, String language) {
        names.put (name, 1 );
        if (language.equalsIgnoreCase(SWAHILI.toString())) {
           return "Jambo, " + name;
        } else if (language.equalsIgnoreCase(ISIXHOSA.toString())) {
            return "Molo, " + name;
        } else if (language.equalsIgnoreCase(ENGLISH.toString())) {
            return "Hello, " + name;
        } else {
            return "Please enter a language";
        }

    }

}
