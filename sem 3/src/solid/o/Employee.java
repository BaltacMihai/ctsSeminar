package solid.o;

public class Employee {
private int ID;
private String name;
private String employeeType;
private int salary;


public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
//public Employee(int iD, String name) {
//	super();
//	ID = iD;
//	this.name = name;
//}


//public Employee(int iD, String name, String employeeType) {
//	super();
//	ID = iD;
//	this.name = name;
//	this.employeeType = employeeType;
//}


public Employee(int iD, String name, String employeeType,int salary) {
	super();
	ID = iD;
	this.name = name;
	this.employeeType = employeeType;
	this.salary = salary;
}



//@Override
//public String toString() {
//	return "Employee [ID=" + ID + ", name=" + name + "]";
//}
@Override
public String toString() {
	return "Employee [ID=" + ID + ", name=" + name + ", employeeType=" + employeeType +" salary = "+ salary + "]";
}


public float calculateBonus() {
	if(this.employeeType == "FTE")
	{
		return this.salary*0.1f;
	}
	if(this.employeeType =="Vendor")
	{
		return this.salary*.05f;
	}
	return this.salary;
}



}
