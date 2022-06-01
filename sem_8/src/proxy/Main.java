package proxy;

public class Main {

	public static void main(String[] args) {
		
		LoginModule loginModule = new LoginModule("admin", "1234");

		String [] dictionarPasswords = new String[] {
				"12345678", "root", "123456", "1234", "abcd"
		};
		
		for(String password : dictionarPasswords) {
			if(loginModule.login("admin", password)) {
				System.out.println("Am gasit parola: "+password);
			}
		}
		
		System.out.println("=============");
		
		ProxyLogin proxy = new ProxyLogin(loginModule);
		for(String password : dictionarPasswords) {
			if(proxy.login("admin", password)) {
				System.out.println("Am gasit parola: "+password);
			}
		}
	}

}
