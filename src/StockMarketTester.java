


public class StockMarketTester {
    public static void main(String[] args) {

        // creatingstock objects
        Stock stock1 = new Stock(101, "Reliance Industries", 9878.34f, 1940);
        Stock stock2 = new Stock(102, "TCS", 3521.50f, 1968);

        // creating stockHolder objects
        StockHolder holder1 = new StockHolder(1032, "Sameer K.", "sameer@gmail.com");
        StockHolder holder2 = new StockHolder(1033, "Riya Sharma", "riya@gmail.com");

        // creating StockHolding objects
        StockHolding holding1 = new StockHolding(101, 1032, 50);
        StockHolding holding2 = new StockHolding(102, 1033, 30);

        // printingstock Details
        System.out.println("---- Stock Details ----");
        System.out.println(stock1.getStockId() + " | " + stock1.getStockName() + " | " +
                stock1.getStockPrice() + " | " + stock1.getEstablishmentYear());

        System.out.println(stock2.getStockId() + " | " + stock2.getStockName() + " | " +
                stock2.getStockPrice() + " | " + stock2.getEstablishmentYear());

        // printing stockHolder details
        System.out.println("\n---- StockHolder Details ----");
        System.out.println(holder1.getDematAccountNo() + " | " + holder1.getName() + " | " +
                holder1.getEmailAddress());

        System.out.println(holder2.getDematAccountNo() + " | " + holder2.getName() + " | " +
                holder2.getEmailAddress());

        // printing stockHolding details
        System.out.println("\n---- StockHolding Details ----");
        System.out.println(holding1.getStockId() + " | " +
                holding1.getDematAccountNo() + " | " + holding1.getQuantity());

        System.out.println(holding2.getStockId() + " | " +
                holding2.getDematAccountNo() + " | " + holding2.getQuantity());

        // testing method overloading
        System.out.println("\n---- Testing updatePrice ----");
        stock1.updatePrice(10000.00f);
        System.out.println("Updated Price: " + stock1.getStockPrice());

        stock1.updatePrice(10500.00f, "Market growth");
        System.out.println("Updated Price: " + stock1.getStockPrice());
        
        
        
        
        
        
        /////////////////////Day2 Assignment////
        System.out.println("\n---- Stock Repository (Static) ----");

        Stock[] allStocks = StockRepository.getAllStocks();

        for (Stock s : allStocks) {
            System.out.println(
                s.getStockId() + " | " +
                s.getStockName() + " | " +
                s.getStockPrice() + " | " +
                s.getEstablishmentYear()
            );
        }

        // Day 2: Inheritance Test
        System.out.println("\n---- Premium Stock Holder ----");

        PremiumStockHolder premium = new PremiumStockHolder(
                2001,
                "Prabhanshu",
                "Prabhanshu@gmail.com",
                "Gold"
        );

        System.out.println(premium.getDematAccountNo());
        System.out.println(premium.getName());
        System.out.println(premium.getEmailAddress());
        System.out.println(premium.getMembershipType());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}