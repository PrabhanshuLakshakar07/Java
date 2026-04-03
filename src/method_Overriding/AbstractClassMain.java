package method_Overriding;

public class AbstractClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp[] employees = new Emp[5];
		employees[0]=new PermanentEmp(101, "James",10000.45f,2300.23f,1200.43f);
		employees[1]=new PermanentEmp(102, "harry",10000.45f,2300.23f,1200.43f);
		employees[2]=new PermanentEmp(103, "rohan",10005.45f,2300.23f,1200.43f);
		employees[3]=new ContractualEmp(105, "Prabhanshu",100000.45f,2300.23f);
		employees[4]=new ContractualEmp(106, "tomy",1000.45f,2300.23f);
		
		for(Emp currentEmp:employees) {
			String empName =currentEmp.getName();
			float finalSalary = currentEmp.processSalary();
			System.out.println(empName + "Is earning A salary : " + finalSalary);
		}
   
		
		
	}

}
