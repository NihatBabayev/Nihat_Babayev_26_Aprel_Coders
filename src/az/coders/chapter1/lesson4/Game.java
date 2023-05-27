package az.coders.chapter1.lesson4;
import java.util.*;
public class Game {
    public void  playing(){
        Random Random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess one number between 1 and 1000");
        int beginIndex = 1;
        int endingIndex = 1000;
        while(true){
            int i = Random.nextInt(beginIndex,endingIndex);
            System.out.println("Is your number bigger or smaller than "+i+" ? (B/S/Answer)");
            String ans = scanner.nextLine();
            if(ans.equals("B")){
                beginIndex = i;
            }
            else if (ans.equals("S")) {
                endingIndex = i;
            }
            else if (ans.equals("Answer")) {
                System.out.println("Answer is "+ i);
                break;
            }
        }

    }

    public static void main(String[] args) {
        Game newPlayer = new Game();
        newPlayer.playing();
    }
}
