import java.util.Scanner;
import java.lang.Exception;

class HorseGameDriver {
   
   public static int horseCount = 2;

   public static void commandLineForInfo(String arg0){

      try {
         horseCount = Integer.parseInt(arg0);
         if(horseCount < 2 || horseCount > 10){
            horseCount = 2;
         }
      } catch (Exception e) {
         //Should not be empty.   
      }
   }

   public static void main(String[] args){


      //Get single arg from command line. If not use 2 as number of horses.
      if(args.length != 1) {
         horseCount = 2;
      }
      else{
         commandLineForInfo(args[0]);
      }

      int x = 1; //var to count horses. I didn't want any horses to be horse 0, so start at 1 and go to x <= horseCount.

      while(x <= horseCount){
          Horse currenthorse = new Horse(x);//creates a horse for each value of x while x <= horseCount
          currenthorse.start();//starts race for each horse!
          x++; //next horse
      }
   }

}