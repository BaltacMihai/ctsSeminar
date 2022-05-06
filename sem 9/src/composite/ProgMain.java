package composite;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Structura menu = new Structura("Menu");
		
		Structura menuDrinks = new Structura("Drinks");
		Structura menuFood = new Structura("Food");
		
		menu.addnode(menuDrinks);
		menu.addnode(menuFood);
		
		menuFood.addnode(new Node("Pizza Carbonara", 20));
		menuFood.addnode(new Node("Pizza Margerita", 30));
		
		System.out.println(menu.getInfo());
		

	}

}
