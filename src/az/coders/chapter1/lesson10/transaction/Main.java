package az.coders.chapter1.lesson10.transaction;

public class Main {
    static Card[] cards = new Card[]{new Card("1111222233334444", 0.5),new Card("5555000011112222", 1000),
            new Card("3333444455556666", 300)};

    static boolean transfer(String senderCardNum, double amount, String receiverCardNum) throws InvalidCardNumberException, SelfTransactionException, InsufficientBalanceException {

        if (senderCardNum.length() != 16 || receiverCardNum.length() != 16) {
            throw new InvalidCardNumberException("Card number is invalid");
        }

        if (senderCardNum.equals(receiverCardNum)){
            throw new SelfTransactionException("You can't send money to yourself");
        }

        for (int i = 0; i < cards.length; i++) {
            if(cards[i].cardNum.equals(senderCardNum)){
                if (cards[i].balance <= 1){
                    throw new InsufficientBalanceException("Your balance is less than 1 azn");
                }
                if(cards[i].balance < amount+1){
                    throw new InsufficientBalanceException("Your balance is low");
                }
                else {
                    cards[i].balance-= amount + 1;
                }
                for (int j = 0; j < cards.length; j++) {
                    if(cards[j].cardNum.equals(receiverCardNum)){
                        cards[j].balance+=amount;
                    }

                }

            }


            break;
        }

        return true;
    }

    // main method to check
    public static void main(String[] args) throws InvalidCardNumberException, InsufficientBalanceException, SelfTransactionException {
        System.out.println(transfer("3333444455556666", 10, "3333444455556666"));
    }

}
class InvalidCardNumberException extends Exception{
    public InvalidCardNumberException(String errorMessage){
        super(errorMessage);
    }

}
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String errorMessage) {
        super(errorMessage);
    }
}
class SelfTransactionException extends Exception{
    public SelfTransactionException(String errorMessage){
        super(errorMessage);
    }
}



