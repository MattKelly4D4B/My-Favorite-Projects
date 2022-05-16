import java.util.Scanner;
import java.lang.Exception;

class TelephoneGameDriver {
   
   public static int playerCount = -1;
   public static String phrase;
   public static int playerNumber;

   public static boolean commandLineForInfo(String arg0, String arg1){


      try {
         playerCount = Integer.parseInt(arg0);
      
      } catch (Exception e) {
        
         System.out.println("You must enter a number.\n");
         return false;

      }

      try {
         if(playerCount < 3 || playerCount > 10){
            throw new Exception();
         }
      } catch (Exception e) {
        
         System.out.println("You must enter a number from 3 to 10.\n");
         return false;
      }
      
      phrase = arg1;
      char[] phraseArray = phrase.toCharArray();
      try {
         for (int x = 0; x < phraseArray.length; x++){
            if(!Character.isLowerCase(phraseArray[x]) && !Character.isSpaceChar(phraseArray[x])){

               throw new Exception();
            }
         }
      } catch (Exception e) {
            System.out.println("You must enter a phrase of only lowercase letters.\n");
            return false;
         }
      
        try {
         String[] myPhraseSplit = phrase.split(" ");

         if(myPhraseSplit.length < 8){
            throw new Exception();
         }
        } catch (Exception e) {
         System.out.print("You must enter at least 8 words.\n");
         return false;
        }
      
        return true;

   }


   public static void promptForPlayerNumber(){
   
      Scanner sc = new Scanner(System.in).useDelimiter("\n");
      System.out.print("Enter number of players: ");
      playerCount = Integer.parseInt(sc.nextLine());
      System.out.print("Enter a phrase with 8 lowercase words:");
      phrase = sc.nextLine();
      sc.close();
      
   }

   public static void main(String[] args){

      if (args.length == 0){
         promptForPlayerNumber();
         if (!commandLineForInfo(Integer.toString(playerCount), phrase)){
            return;
         }

      }else {

      try {
         if(args.length != 2) {
            throw new Exception();
         }
         else{
            if (!commandLineForInfo(args[0], args[1])){
               return;
            }
         }
         
      } catch (Exception e) {
         System.out.println("Must have 2 arguments.\n");
      }
   
      playerCount = Integer.parseInt(args[0]);
      phrase = args[1];
   
   }
      int x = 0;
      while(x <= playerCount){
          Player currentPlayer = new Player(phrase);
          phrase = currentPlayer.playerthings();
          x++;         
          System.out.println(phrase);           
      }
   
      System.out.println(phrase);         

   }

}