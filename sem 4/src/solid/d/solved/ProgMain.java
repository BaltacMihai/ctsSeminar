package solid.d.solved;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calculator c =new Calculator();
		IOperationType add = new AddOperation();
		c.calculate(0, 0, add);

	}

}
