package commands;

import counter.Count;
import languages.Language;




public class Greeter {

    Count counter;

    public Greeter(Count counter) {
        this.counter = counter;
    }

    public String greet(String name, String languageString) {
        counter.countUser(name);
        Language language = getLanguage(languageString);

        switch (language) {
            case ENGLISH:
                return "Hello, " + name;

            case ISIXHOSA:
             return "Molo, " + name;

            case SWAHILI:
                return  "Jambo, " + name;

            default:
                 return   "Please enter a valid command!";
        }
    }

    private Language getLanguage(String lang){
        // use a try catch block to return English as default greeting Language
        try {
            return Language.valueOf(lang.toUpperCase());
        }
        catch (NullPointerException | IllegalArgumentException e){

            return Language.ENGLISH;
        }
    }
}




