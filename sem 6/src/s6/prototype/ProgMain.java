package s6.prototype;

public class ProgMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		BookShop carturesti = BookShop.loadDataFromBD("carturesti");
		
		System.out.println(carturesti);
		
		//bad way
		BookShop diverta = carturesti;
		
		// shallow copy - we copy the address of the objects
		System.out.println("=======================================");
		System.out.println("SHALLOW COPY");
		
		diverta.getBooks().remove(3);
		
		System.out.println(carturesti);

		
		//Deep Copy
		BookShop litera = (BookShop) carturesti.clone();
		System.out.println("=======================================");
		System.out.println("DEEP COPY");
		
		litera.getBooks().remove(4);
		
		System.out.println(carturesti);
		
		// to be sure implement clonable on every class.
	}

}
