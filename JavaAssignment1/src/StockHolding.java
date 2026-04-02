public class StockHolding {
    private int stockId;
    private int dematAccountNo;
    private int quantity;

    // constructor
    public StockHolding(int stockId, int dematAccountNo, int quantity) {
        this.stockId = stockId;
        this.dematAccountNo = dematAccountNo;
        this.quantity = quantity;
    }

    // getters  setters
    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public int getDematAccountNo() {
        return dematAccountNo;
    }

    public void setDematAccountNo(int dematAccountNo) {
        this.dematAccountNo = dematAccountNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}