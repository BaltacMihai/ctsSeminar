package solid.o.resolved;

public class FTEEmployee extends Employee implements IBonusCalculation {

	float salary;
	
	public FTEEmployee(int iD, String name, float salary) {
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
		return super.toString() +" salary = "+ salary + "]";
	}
}
