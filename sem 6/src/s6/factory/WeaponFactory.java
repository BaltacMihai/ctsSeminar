package s6.factory;

public class WeaponFactory {

	public static IWeapon createWeapon(float price) throws Exception {
		if(price < 200) {
			return new CheapWeapon();
		}
		if(price >=200 && price <=500)
		{
			return new MediumWeapon();
		}
		if(price>500) {
			return new HighWeapon();
		}
		else
		{
			throw new Exception("Something bad happend");
		}
	}
}
