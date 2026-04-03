package method_Overriding;

public  class ContractualEmp extends Emp {
	private float incentives ;

	public float getIncentives() {
		return incentives;
	}

	public void setIncentives(float incentives) {
		this.incentives = incentives;
	}

	public ContractualEmp(int empno, String name, float basicsalary, float incentives) {
		super(empno, name, basicsalary);
		this.incentives = incentives;
	}

	@Override
	 public float processSalary() {
		// TODO Auto-generated method stub
		
		float finalSalary= getBasicsalary() + incentives;
		return finalSalary;
	}

}
