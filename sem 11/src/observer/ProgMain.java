package observer;

public class ProgMain {

	public static void main(String[] args) {
		
		RainEvent rain = new RainEvent("rain");
		
		IHandler irina = new IrinaHandler();
		IHandler andrei = new AndreiHandler();
		IHandler maria = new MariaHandler();
		
		rain.subscribeHandler(irina);
		rain.subscribeHandler(andrei);
        rain.subscribeHandler(maria);
        
		rain.activateEvent();

	}

}
