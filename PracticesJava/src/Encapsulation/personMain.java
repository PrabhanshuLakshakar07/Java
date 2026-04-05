package Encapsulation;

public class personMain {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Person person =new Person();
		
		person.setName("Prabhanshu");
		person.setAge(23);
		person.setCounty("India");
		
	System.out.println("Hi My Name Is " + person.getName() );
	System.out.println(" And My Age is " + person.getAge() );
		
	System.out.println("or i'm live in " + person.getCounty() );
		
		
		
	}

}
