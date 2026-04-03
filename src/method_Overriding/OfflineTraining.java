package method_Overriding;

public class OfflineTraining extends Training {

	     private String venue;
	     
	     public OfflineTraining() {
	    	 venue ="YCP MUMBAI";
	     }

		 public OfflineTraining(String moduleName, int duration, String venue) {
			super(moduleName, duration);
			this.venue = venue;
		 }

		 public String getVenue() {
			 return venue;
		 }

		 public void setVenue(String venue) {
			 this.venue = venue;
		 }
		 
		 @Override
		 public void conductTraining() {
			 System.out.println("Conducting a training On " + getModuleName() + " for " + getDuration() +" Hours At " + venue);
		 }
		 
		 @Override
		 public String getDetails() {
			 String details = super.getDetails() + "Venue :"+ venue;
			 return details;
		 }
		 
		 
	 
}
