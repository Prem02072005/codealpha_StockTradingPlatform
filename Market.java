import java.util.HashMap;

public class Market {

    private HashMap<String, Stock>
            stocks = new HashMap<>();

    public Market() {

        stocks.put("TCS",
                new Stock("TCS",3500));

        stocks.put("INFY",
                new Stock("INFY",1800));

        stocks.put("RELIANCE",
                new Stock("RELIANCE",2900));
    }

    public void displayMarket() {

        System.out.println("\nMARKET DATA");

        for(Stock stock : stocks.values()) {

            System.out.println(
                    stock.getSymbol()
                    + " ₹"
                    + stock.getPrice());
        }
    }

    public Stock getStock(String symbol) {
        return stocks.get(symbol);
    }
}