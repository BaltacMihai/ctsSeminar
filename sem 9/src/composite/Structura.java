package composite;

import java.util.ArrayList;

public class Structura extends ANode {
	
	private String name;
	// missing price;
	private ArrayList<ANode> list = new ArrayList<ANode>();
	
	public Structura(String name) {
		super();
		this.name = name;
	}
	
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}



	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
//		return 0;
		throw new UnsupportedOperationException();
	}


	@Override
	public void addnode(ANode element) {
		// TODO Auto-generated method stub
		//super.addnode(element);
		list.add(element);
	}



	@Override
	public void removeNode(ANode element) {
		// TODO Auto-generated method stub
//		super.removeNode(element); //Not ok here
		
		list.remove(element);
		
	}

	@Override
	public ANode getNode(int index) {
		return list.get(index);
		// TODO Auto-generated method stub
//		super.getNode(index);
		
	}



	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
//		return super.getInfo();
		
		String info =this.getName() + " \n";
		for(ANode nod:list) {
			info +=nod.getInfo()+ " \n";
		}
			
			
			
			return info;
	}
	
	

	
	
}
