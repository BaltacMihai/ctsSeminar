package s5.singleton_fastInitialization;

//early intialization
public class Database {

	//atr
	private static Database INSTANCE = new Database();
	private Database() {
		///
	}
	
	public static Database getInstance() {
		return INSTANCE;
	}
}
