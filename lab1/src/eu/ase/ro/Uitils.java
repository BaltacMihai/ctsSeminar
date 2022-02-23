package eu.ase.ro;

public class Uitils {


	public void function(int vector[]) {
		int minim = vector[0];
		int counter = 1;
		for(int i=1;i<vector.length ; i++) {
			
			if( minim > vector[i]) {minim= vector[i];
			counter = 1;
			}
			
			else if (minim == vector[i]) {
				counter ++;
			}
		}
	}


}
