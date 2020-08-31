package factory;

public class Output {

    private  String result;
    private boolean commandOutput;

    public Output(String outputText, boolean commandOutput){
        this.result = outputText;
        this.commandOutput = commandOutput;
    }


    public String getResult(){
        return this.result;
    }

    public boolean getCommandOutput(){
        return this.commandOutput;
    }
}
