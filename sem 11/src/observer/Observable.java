package observer;

import java.util.ArrayList;

public abstract class Observable {
	
	private ArrayList<IHandler> listObservers = new ArrayList<>();
	
	public void subscribeHandler(IHandler handler) {
 
		
		listObservers.add(handler);
	}
	public void unsubscribeHandler(IHandler handler) {
		listObservers.remove(handler);
		
	}
	
	public void notifyAllHandlers() {
		
		for(IHandler handler: listObservers) {
			handler.act();
		}
	}

}
