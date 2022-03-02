package ro.ase.acs.example1;

public class Utils {

	//public int findMaxInsideUnsortedArray(int [] v)
	
		public int findMinInsideUnsortedArray(int [] v) throws Exception {
			if(v==null || v.length==0 ) {
				throw new Exception("Vector is null");
			}
			
			//we are looking for the maximum, but the variable
			// name is min => so we have ambigues name variable
			// the function create the name
			int min=v[0];
			
			
			//Complexity is O(n/2) for both fors, so in the end the complexity
			//is O(n)
//			for(int i=1;i<v.length-1;i=i+2) {
//				if(min>v[i]) {
//					min=v[i];
//				}
//			}
//			for(int i=2;i<v.length;i=i+2) {
//				if(min>v[i]) {
//					min=v[i];
//				}
//				
//			}
			
			//Complexity is O(n)
			for(int i=0; i<v.length;i++) {
				if(min>v[i]) {
				min=v[i];
			}
			}
					
			return min;
		}
}
