package az.coders.chapter1.lesson16;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;


public class FirstProblem {

    static void transaction(Card sender, Card receiver, int amount) throws CardNumberException {
        Optional<User> optionalUser = Optional.of(sender.user);
        Optional<User> optionalUser1 = Optional.of(receiver.user);
        //it checks if users exist in users class
        optionalUser.orElseThrow(() -> new UserDoesntExistException("Card number doesn't contain any user"));
        optionalUser1.orElseThrow(() -> new UserDoesntExistException("Card number doesn't contain any user"));



        Optional<Card> optionalSenderCard = Optional.of(sender);



        //it checks validness of card number(it should be 16 digits)
        //sender card is checking
        boolean isValid = sender.cardNumber.chars()
                .allMatch(Character::isDigit) // Check if all characters are digits
                && sender.cardNumber.length() == 16; // Check if the length is 16

        if (!isValid) {
            throw new CardNumberException("Invalid card number");
        }

        //receiver card is checking
        boolean isValid1 = receiver.cardNumber.chars()
                .allMatch(Character::isDigit) // Check if all characters are digits
                && receiver.cardNumber.length() == 16; // Check if the length is 16

        if (!isValid) {
            throw new CardNumberException("Invalid card number");
        }





        //Checking expire date for both cards:
        optionalSenderCard.filter(a-> sender.expiredDate.compareTo(LocalDate.now()) > 0).orElseThrow(() -> new ExpireDateException("Expired"));
        optionalSenderCard.filter(a-> receiver.expiredDate.compareTo(LocalDate.now()) > 0).orElseThrow(() -> new ExpireDateException("Expired"));


        //last step.
        //here it checks and changes amount in sender card
        sender.amount = optionalSenderCard.filter(a -> a.amount > amount)
                 .map(a-> sender.amount-amount)
                 .orElseThrow(() -> new InsufficientBalanceException("Insufficient balance in sender's card."));
        //change in amount of receiver
        receiver.amount+=amount;






    }
    public static void main(String[] args) {
        //initializing users
        User user1 = new User("Nihat", "Babayev");
        User user2 = new User("Murad", "Baghirli");
        User user3 = new User("Ismayil", "Abdullazada");
        User user4 = new User("Valeh", "Ismayilov");
        List<User> users = Arrays.asList(user1,user2,user3,user4);

        //initializing cards
        Card card1 = new Card(user1, "1111222233334444",1200,LocalDate.of(2027,2,23));
        Card card2 = new Card(user2, "0000222233334444",900,LocalDate.of(2028,5,1));
        Card card3 = new Card(user3, "1111666633334444",600,LocalDate.of(2028,2,4));
        Card card4 = new Card(user4,"7777222233334444", 300, LocalDate.of(2029, 12, 12));
        List<Card> cards = Arrays.asList(card1, card2, card3, card4);



        //test
        FirstProblem.transaction(cards.get(0), cards.get(1), 100);
        System.out.println(cards.get(0).amount);
        System.out.println(cards.get(1).amount);
    }
}

class User{
    String name;
    String username;

    public User(String name, String username) {
        this.name = name;
        this.username = username;
    }
}
class Card{
    public Card(User user, String cardNumber, int amount, LocalDate expiredDate) {
        this.user = user;
        this.cardNumber = cardNumber;
        this.amount = amount;
        this.expiredDate = expiredDate;
    }

    User user;
    String cardNumber;
    int amount;
    LocalDate expiredDate;

}
class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(String errorMessage){
        super(errorMessage);
    }
}
class UserDoesntExistException extends RuntimeException{
    public UserDoesntExistException(String errorMessage){
        super(errorMessage);
    }
}

class CardNumberException extends RuntimeException{
    public CardNumberException(String errorMessage){
        super(errorMessage);
    }
}
class ExpireDateException extends RuntimeException{
    public  ExpireDateException(String errorMessage){
        super(errorMessage);
    }
}
