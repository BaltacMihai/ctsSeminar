package solid.s.resolved;



//ex: IUser.login();
public interface IUser {
	
	//these methods have a single respons
	public boolean login(String username, String password);
	public boolean register(String email,String username, String password);
	
	// now in the IEmailSender 
	//public boolean sendEmail(String content);
	
	// now in the ILoggerError
	//public void logError(String errorContent);
	
}
