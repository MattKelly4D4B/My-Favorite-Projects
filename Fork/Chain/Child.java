class Child extends Thread
{

private int childNumber;

// ----------------------------------------------
public Child(int childNumber)
{
    this.childNumber = childNumber;

} // End constructor


// ----------------------------------------------
@Override
public void run()
{
    System.out.println("I am the child" + childNumber);
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        System.out.println("Failed.");
    }
    System.out.println("Child Number: "+ childNumber +" has woken up!");


} // End method

} // End class
