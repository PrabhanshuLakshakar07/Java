public class PremiumStockHolder extends StockHolder {

    private String membershipType;

    // Constructor with super()
    public PremiumStockHolder(int dematAccountNo, String name, String emailAddress, String membershipType) {
        super(dematAccountNo, name, emailAddress);
        this.membershipType = membershipType;
    }

    public String getMembershipType() {
        return membershipType;
    }
}