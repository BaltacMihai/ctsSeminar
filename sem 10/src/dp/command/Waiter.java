package dp.command;

import java.util.ArrayList;

public class Waiter {
	
	private ArrayList<ICommand> commandList = new ArrayList<ICommand>();
	
	
	public void noteCommands(ICommand c) {
		commandList.add(c);
		
	}
	
	public void sendCommand() {
		
		for(ICommand c: commandList) {
			c.process();
		}
		commandList.clear();
		
		
	}

}
