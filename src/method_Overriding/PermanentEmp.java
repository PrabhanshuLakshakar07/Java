package method_Overriding;

public class PermanentEmp extends Emp {
	
	private float da;
	private float hra;

	
	public PermanentEmp() {
		super();
		// TODO Auto-generated constructor stub
	}


	public float getDa() {
		return da;
	}


	public void setDa(float da) {
		this.da = da;
	}


	public float getHra() {
		return hra;
	}


	public void setHra(float hra) {
		this.hra = hra;
	}


	public PermanentEmp(int empno, String name, float basicsalary, float da, float hra) {
		super(empno, name, basicsalary);
		this.da = da;
		this.hra = hra;
	}


	@Override
	 public float processSalary() {
		// TODO Auto-generated method stub
		float finalSalary= getBasicsalary() + da +hra;
		
		return finalSalary;
	}

}
