package dp.template;

public abstract class ATemplateProcedure {
	
	public abstract void getProcedurePapers();
	public abstract void getOfficerApprovalForProcedure();
	public abstract void identifyDamages();
	public abstract void evaluateHouse();
	public abstract void sendEvaluation();
	
	
	public void getInsurance() {
		
		getProcedurePapers();
		getOfficerApprovalForProcedure();
		identifyDamages();
		evaluateHouse();
		sendEvaluation();
		//return smth
	}

}
