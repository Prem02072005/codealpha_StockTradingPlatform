import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Market market = new Market();

        User user = new User("Prem");

        while(true) {

            System.out.println("\n1. Market");
            System.out.println("2. Buy");
            System.out.println("3. Sell");
            System.out.println("4. Portfolio");
            System.out.println("5. History");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:

                    market.displayMarket();
                    break;

                case 2:

                    System.out.print("Stock: ");
                    String buyStock = sc.next();

                    System.out.print("Qty: ");
                    int buyQty = sc.nextInt();

                    user.getPortfolio()
                            .buy(buyStock,buyQty);

                    user.getTransactions()
                            .add(new Transaction(
                                    "BUY",
                                    buyStock,
                                    buyQty));

                    break;

                case 3:

                    System.out.print("Stock: ");
                    String sellStock = sc.next();

                    System.out.print("Qty: ");
                    int sellQty = sc.nextInt();

                    user.getPortfolio()
                            .sell(sellStock,sellQty);

                    user.getTransactions()
                            .add(new Transaction(
                                    "SELL",
                                    sellStock,
                                    sellQty));

                    break;

                case 4:

                    System.out.println(
                            user.getPortfolio()
                                    .getHoldings());

                    break;

                case 5:

                    for(Transaction t :
                            user.getTransactions()) {

                        System.out.println(t);
                    }

                    break;

                case 6:

                    System.exit(0);
            }
        }
    }
}