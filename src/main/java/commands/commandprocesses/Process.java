package commands.commandprocesses;

import commands.commandprocesses.Command;

public interface Process {

   String process(Command command);
   // implemented by all commands to process the output of each command



}
