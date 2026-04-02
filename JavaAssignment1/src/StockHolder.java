public class StockHolder {
    private int dematAccountNo;
    private String name;
    private String emailAddress;

    //constructor
    public StockHolder(int dematAccountNo, String name, String emailAddress) {
        this.dematAccountNo = dematAccountNo;
        this.name = name;
        this.emailAddress = emailAddress;
    }

    //getters and setters
    public int getDematAccountNo() {
        return dematAccountNo;
    }

    public void setDematAccountNo(int dematAccountNo) {
        this.dematAccountNo = dematAccountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}