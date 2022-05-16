import java.util.*;
   
public class LinkedLists {
   
    public static String phrase = "This is my number: ";
    public static int playerNumber;

    public static void main(String args[])
    {
        int playerCount = 5;
        int x = 1;
        String words = "here are more words to scramble";
        while(x <= playerCount){
            Player currentPlayer = new Player(words);
            words = currentPlayer.playerthings();
            System.out.println(words);
            x++;           
        }
    }
}