package method_Overriding;

public class OnlineTraining extends Training {
	private String meetingLink;
	
	public OnlineTraining() {
   	
		meetingLink="https://meet.google.com/49854";
		
    }
	
    public OnlineTraining(String moduleName, int duration, String meetingLink) {
		super(moduleName, duration);
		this.meetingLink = meetingLink;
	}
	public String getMeetingLink() {
		return meetingLink;
	}

	public void setMeetingLink(String meetingLink) {
		this.meetingLink = meetingLink;
	}
	 @Override
	 public void conductTraining() {
		 System.out.println("Conducting a training On " + getModuleName() + " for " + getDuration() +" Hours At " + meetingLink);
	 }
	 
	 @Override
	 public String getDetails() {
		 String details =super.getDetails() +"Venue :"+ meetingLink;
		 return details;
	 }
	
}
