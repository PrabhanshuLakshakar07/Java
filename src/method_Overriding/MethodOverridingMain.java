package method_Overriding;

public class MethodOverridingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OfflineTraining offlineTrg = new OfflineTraining();
		offlineTrg.conductTraining();
		
		OnlineTraining onlineTrg = 
				new OnlineTraining("React js" , 40 , "https://meet.google.com/49854");
		
		onlineTrg.conductTraining();
		
		System.out.println("=============OfflineDetails===============");
		
		System.out.println(offlineTrg.getDetails());	
		System.out.println("=============OnlineDetails===============");
		System.out.println(onlineTrg.getDetails());		
		
		
		
		
		
		
		/*
		System.out.println("============================");
		
		Training trg =new OfflineTraining();
		trg.conductTraining();
		
		trg.setModuleName("AWS");
		
		
		OfflineTraining offTrg = (OfflineTraining)trg;
		offTrg.setVenue(".....");
		*/
		

	}

}
