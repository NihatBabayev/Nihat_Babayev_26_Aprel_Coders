package az.coders.chapter1.lesson23;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Card> cardList = new ArrayList<>();
        cardList.add(new Card("Nihat", "1111222233334444", 100.0, LocalDate.of(2024, 7, 13)));
        cardList.add(new Card("Murad", "1111222233335555", 200.0, LocalDate.of(2025, 7, 13)));
        cardList.add(new Card("Ismayil", "1111222233336666", 300.0, LocalDate.of(2026, 7, 13)));

        Map<String, Double> balances = new HashMap<>();
        balances.put("Nihat", 100.0);
        balances.put("Murad", 200.0);
        balances.put("Ismayil", 300.0);

        List<Thread> threads = new ArrayList<>();

        for (Card card : cardList) {
            Thread incrementThread = new BalanceIncrementerThread(card, balances);
            Thread printThread = new BalancePrinterThread(card, balances);

            incrementThread.start();
            printThread.start();

            threads.add(incrementThread);
            threads.add(printThread);
        }

        for (Thread thread : threads) {
            thread.join();
        }
    }
}

class Card {
    String holderName;
    String cardNumber;
    double balance;
    LocalDate expDate;

    public Card(String holderName, String cardNumber, double balance, LocalDate expDate) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.expDate = expDate;
    }
}

class BalanceIncrementerThread extends Thread {
    private final Card card;
    private final Map<String, Double> balances;

    public BalanceIncrementerThread(Card card, Map<String, Double> balances) {
        this.card = card;
        this.balances = balances;
    }

    @Override
    public void run() {
        synchronized (balances) {
            double currentBalance = balances.get(card.holderName);
            double newBalance = currentBalance + 1000.0;
            balances.put(card.holderName, newBalance);
        }
    }
}

class BalancePrinterThread extends Thread {
    private final Card card;
    private final Map<String, Double> balances;

    public BalancePrinterThread(Card card, Map<String, Double> balances) {
        this.card = card;
        this.balances = balances;
    }

    @Override
    public void run() {
        synchronized (balances) {
            double balance = balances.get(card.holderName);
            System.out.println(card.holderName + " " + balance);
        }
    }
}
