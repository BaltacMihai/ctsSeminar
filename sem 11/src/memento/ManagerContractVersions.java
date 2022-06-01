package memento;

import java.util.ArrayList;

public class ManagerContractVersions {
	
	private ArrayList<ContractVersion> listContractVersions = new ArrayList<ContractVersion>();
	
	public void addContractVersion(ContractVersion contractVersion) {
		this.listContractVersions.add(contractVersion);
	}

	
	public ContractVersion recoverContract(int i) {
		
		return this.listContractVersions.get(i);
	}
	
	
	
	
}
