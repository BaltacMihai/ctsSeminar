package solid.s;

//the first 2 methods can be incapsulate in the 
//name of the User

//ex: IUser.login();
public interface IUser {
	
	//these methods have a single respons
	public boolean login(String username, String password);
	public boolean register(String email,String username, String password);
	
	// this methods arent in the main resp
	public boolean sendEmail(String content);
	public void logError(String errorContent);
	
}
