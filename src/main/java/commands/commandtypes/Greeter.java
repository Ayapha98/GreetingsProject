package commands.commandprocesses;

import languages.Language;


public class Greeter {


    public String greet(String name, String languageString) {

        Language language = getLanguage(languageString);

        switch (language) {
            case ENGLISH:
                return "Hello, " + name;

            case ISIXHOSA:
             return "Molo, " + name;

            case SWAHILI:
                return  "Jambo, " + name;

            case     

            default:
                 return   "Please enter a valid command!";
        }
    }

    private Language getLanguage(String lang){
        //   return English as default greeting Language
        try {
            return Language.valueOf(lang.toUpperCase());
        }
        catch (NullPointerException | IllegalArgumentException e){

            return Language.ENGLISH;
        }
    }
}




