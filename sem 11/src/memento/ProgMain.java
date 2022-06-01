package memento;

public class ProgMain {

	public static void main(String[] args) {
		
		 ManagerContractVersions  manager = new ManagerContractVersions();
		
		Contract contract = new Contract("Irina");
		contract.addClause("increase salary");
		manager.addContractVersion(contract.saveVersion());
	    System.out.println(contract);
	    
	    contract.addClause("WFH");
	    manager.addContractVersion(contract.saveVersion());
	    System.out.println(contract);
	    
	    contract.addClause("manager new role");
	    manager.addContractVersion(contract.saveVersion());
	    System.out.println(contract);
	    
	    //manager.recoverContract(0);
	    contract.restoreFromVersion(manager.recoverContract(0));
	    
	    System.out.println("--------------Recover------------");
	    System.out.println(contract);
		

	}

}
