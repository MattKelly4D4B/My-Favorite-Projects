 import java.util.*;

 public class Horse extends Thread{

    private int horseNumber; //Current horses number
    private Random generator = new Random(); //random number generator called generator.
    int totalDistance = 0; //Total distance traveled.

    public Horse(int horse){
        this.horseNumber = horse; //sets horseNumber from number passed in. 
   }

    @Override
    public void run(){
        while (totalDistance < 100){ //loop until total distance is reached.
            int strideDistance = (generator.nextInt(5)) + 6; //random number between 6 and 10 for strideDistance
            totalDistance += strideDistance; //add strideDistance to totalDistance
            System.out.println("Horse Number: "+ horseNumber+" has a stride distance of: " + 
            strideDistance + " and a total distance of: " + totalDistance ); //Print the results
        }
    }
}