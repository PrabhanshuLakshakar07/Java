package method_Overriding;

public class Training {
	private String moduleName;
	private int duration ; //hour
	
	public Training() {
		moduleName="OOP using Java ";
		duration =60;
		
	}

	public Training(String moduleName, int duration) {
		super();
		this.moduleName = moduleName;
		this.duration = duration;
	}
	
	public Training( int duration , String moduleName) {
		super(); 
		this.moduleName = moduleName;
		this.duration = duration;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void conductTraining() {
		System.out.println("Conducting a training on " + moduleName);
		
	}
	public String getDetails() {
		String details =
				"Module Name :" + moduleName +
				"\nDuration(Hrs):" + duration;
		return details;
		
	}
	

}
