import java.util.HashMap;

public class Portfolio {

    private HashMap<String,Integer> holdings
            = new HashMap<>();

    public void buy(String stock,
                    int qty) {

        holdings.put(stock,
                holdings.getOrDefault(stock,0)
                        + qty);
    }

    public void sell(String stock,
                     int qty) {

        if(holdings.containsKey(stock)) {

            int current = holdings.get(stock);

            if(current >= qty) {
                holdings.put(stock,
                        current - qty);
            }
        }
    }

    public HashMap<String,Integer>
    getHoldings() {
        return holdings;
    }
}
