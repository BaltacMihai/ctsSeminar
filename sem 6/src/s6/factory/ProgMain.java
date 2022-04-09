package s6.factory;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IWeapon weapon; //hide the type of weapon;
		try {
			weapon = WeaponFactory.createWeapon(600);
			weapon.Weapon();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
