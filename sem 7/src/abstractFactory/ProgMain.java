package abstractFactory;

public class ProgMain {
	
	public static void main(String[] args) {
		
		//Simple factory
//		Factory factory = new Factory();
//		IWeapon weapon = factory.getWeapon(300);
//		weapon.power();
		
		//Factory method
//		IFactory factory = new CheapFactory();
//		IWeapon weapon = factory.getWeapon();
//		weapon.power();
		
		//Absract factory
//		IFactory factory = new abstractFactory.MagicFactory();
		Shop shop = new Shop(new MagicFactory());
		shop.createFamilyObjs();
		
	}

}
