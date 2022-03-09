package solid.o;

public class ProgMainO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee empMada = new Employee(1, "Mada", "FTE",2000);
		System.out.print(empMada.toString() + "Bonus" + empMada.calculateBonus());

		Employee empJhon = new Employee(2, "Jhon", "Vendor",1800);
		System.out.print(empJhon.toString()+ "Bonus " + empJhon.calculateBonus());
	}

}
