public class Stock {
    private int stockId;
    private String stockName;
    private float stockPrice;
    private int establishmentYear;

    //constructor
    public Stock(int stockId, String stockName, float stockPrice, int establishmentYear) {
        this.stockId = stockId;
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.establishmentYear = establishmentYear;
    }

    //getters and setters
    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public float getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(float stockPrice) {
        this.stockPrice = stockPrice;
    }

    public int getEstablishmentYear() {
        return establishmentYear;
    }

    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }

    // Method Overloading
    public void updatePrice(float newPrice) {
        this.stockPrice = newPrice;
    }

    public void updatePrice(float newPrice, String reason) {
        this.stockPrice = newPrice;
        System.out.println("Price updated due to: " + reason);
    }
}