package a5.builder.solved;

public class User {
	// mandatory
	private String username;
	private String email;
	private String firstName;
	private String lastName;
	
	//optional
	private String phoneNo;
	private String address;
	private String birthday;
	
	public User(UserBuilder u) {
		
		this.username = u.username;
		this.email = u.email;
		this.firstName = u.firstName;
		this.lastName = u.lastName;
		
		// optional
		this.address = u.address;
		this.birthday = u.birthday;
		this.phoneNo = u.phoneNo;
	}
	
	public class UserBuilder{
		// mandatory
		private String username;
		private String email;
		private String firstName;
		private String lastName;
		
		//optional
		private String phoneNo;
		private String address;
		private String birthday;
		
		
		public UserBuilder(String username, String email, String firstName, String lastName) {
			super();
			this.username = username;
			this.email = email;
			this.firstName = firstName;
			this.lastName = lastName;
		}


	public UserBuilder birthday(String birthday) {
		this.birthday = birthday;
		return  this;
	}
	
	public UserBuilder address(String address) {
		this.address = address;
		return  this;
	}
		
	public UserBuilder phoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
		return  this;
	}
		
	
	public User build() {
		User u = new User(this);
		return u;
	}
	}
	
	

}
