package proxy;

public class LoginModule implements ILoginModule {
	private String user;
	private String password;

	@Override
	public boolean login(String username, String password) {
		if(this.user.equals(username) && this.password.equals(password)) {
			return true;
		}
		return false;
	}

	public LoginModule(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}

}
