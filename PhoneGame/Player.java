 import java.util.*;

 public class Player{

    public String currentString;
    public static ArrayList<String> newWords = new ArrayList<String>();

    public Player(String playerString){
        currentString = playerString;       
   }

    public String playerthings(){
        String myArray[] = currentString.split(" ");
        Random rand = new Random();
        
        int randomNum1 = 0;
        int randomNum2 = 0;
        randomNum1 = rand.nextInt(myArray.length);
        randomNum2 = rand.nextInt(myArray.length);

        while (randomNum1 == randomNum2){
            randomNum2 = rand.nextInt(myArray.length);
        }

        int indexA = randomNum1;
        int indexB = randomNum2;

        String tempWordA = "";        
        tempWordA = myArray[indexA];
        myArray[indexA] = myArray[indexB];
        myArray[indexB] = tempWordA;

        String newString = "";
        
        for(int x = 0; x < myArray.length; x++){

            newString += myArray[x] + " ";
        }
            return newString;
    }
}