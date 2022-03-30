package a5.builder.solved;

public class progMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User u= new User.UserBuilder("madalina@csie.ro","madalina","madalina","pana").address("Bucharest").build();
		User u1= new User.UserBuilder("madalina@csie.ro","madalina","madalina","pana").phone("0727121308").build();
		
	}

}
