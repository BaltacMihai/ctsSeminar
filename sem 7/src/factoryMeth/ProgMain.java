package factoryMeth;

public class ProgMain {
	
	public static void main(String[] args) {
		
//		Factory factory = new Factory();
//		IWeapon weapon = factory.getWeapon(300);
//		weapon.power();
		
		//Factory method
		IFactory factory = new CheapFactory();
		IWeapon weapon = factory.getWeapon(0);
		weapon.power();
		
	}

}
