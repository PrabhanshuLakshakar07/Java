package method_Overriding;

 public abstract class Emp {
	
	private int empno;
	private String name;
	private float basicsalary;
	
	public Emp() {
		// TODO Auto-generated constructor stub
		
		
		
	}

	 public Emp(int empno, String name, float basicsalary) {
		super();
		this.empno = empno;
		this.name = name;
		this.basicsalary = basicsalary;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBasicsalary() {
		return basicsalary;
	}

	public void setBasicsalary(float basicsalary) {
		this.basicsalary = basicsalary;
	}
	
	public abstract float processSalary();
	

	

}
