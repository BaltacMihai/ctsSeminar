package a5.builder;

public class User {
	// mandatory
	private String username;
	private String email;
	private String firstName;
	private String lastName;
	
	//optional
	private String phoneNo;
	private String adress;
	private String birthday;
	
	public User(String username, String email, String firstName , String lastName, String phoneNo, String adress,
			String birthday) {
		super();
		this.username = username;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.adress = adress;
		this.birthday = birthday;
	}

	public User(String username, String email, String firstName, String lastName) {
		super();
		this.username = username;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public User(String username, String email, String firstName, String lastName, String phoneNo, String adress) {
		super();
		this.username = username;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.adress = adress;
	}

	public User(String username, String email, String firstName, String lastName, String phoneNo, String birthday) {
		super();
		this.username = username;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.birthday = birthday;
	}

	public User(String username, String email, String firstName, String lastName, String adress, String birthday) {
		super();
		this.username = username;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adress = adress;
		this.birthday = birthday;
	}

	public User(String username, String email, String firstName, String lastName, String phoneNo) {
		super();
		this.username = username;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}

	public User(String username, String email, String firstName, String lastName, String birthday) {
		super();
		this.username = username;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}
	
	// and so one
	
	

}
