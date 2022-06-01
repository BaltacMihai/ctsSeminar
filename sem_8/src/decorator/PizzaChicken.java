package decorator;

public class PizzaChicken extends DecoratorPizza{

	public PizzaChicken(APizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return super.getIngredients()+", chicken";
	}

	@Override
	public float getCostTotal() {
		// TODO Auto-generated method stub
		return super.getCostTotal()+10;
	}

}
