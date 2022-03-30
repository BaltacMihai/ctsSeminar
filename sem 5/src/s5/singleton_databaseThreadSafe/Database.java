package s5.singleton_databaseThreadSafe;

// early intialization abstract
public class Database {

	//atr
	private static Database INSTANCE = null;
	
	
	private Database() {
 		///
		
		
	}
	// is not ok to synchronize evry methods the method
//	/public synchronized static Database getInstance() 

	//as in js, we use sync only where I want the code to wait
	
	// this is the best for exam
	public static Database getInstance() {
		if(INSTANCE == null)
		{
			synchronized (Database.class) {
				if(INSTANCE == null) {
				INSTANCE = new Database();
				}
			}
			
		}
		return INSTANCE;
	}
}
