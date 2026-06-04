import java.util.ArrayList;

public class User {

    private String name;

    private Portfolio portfolio;

    private ArrayList<Transaction>
            transactions;

    public User(String name) {

        this.name = name;

        portfolio = new Portfolio();

        transactions = new ArrayList<>();
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public ArrayList<Transaction>
    getTransactions() {
        return transactions;
    }
}