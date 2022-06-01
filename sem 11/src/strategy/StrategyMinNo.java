package strategy;

public class StrategyMinNo implements IStrategyFindSpecificNo{

	@Override
	public int process(int[] v) {
		
		if(v.length<=0) return 0;
		int min=0;
	  for(int i=0;i<v.length;i++) {
		  if(min > v[i]) {
			  min = v[i];
		  }
	  }
	  return min;
	}

	}

	
	
	

