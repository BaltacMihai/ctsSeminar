package solid.o.resolved;

//1 extends
// inf implem

public class VendorEmployee extends Employee implements IBonusCalculation{

	private float salary;
	
	public VendorEmployee(int iD, String name, float salary) {
		super(iD, name);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateBonus() {
		
		return this.salary*.05f;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	public String toString() {
		return this.toString() +" salary = "+ salary + "]";
	}


}
