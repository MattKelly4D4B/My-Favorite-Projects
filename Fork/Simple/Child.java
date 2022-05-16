class Child extends Thread
{

private int threadNumber;

// ----------------------------------------------
public Child(int threadNumber)
{


} // End constructor


// ----------------------------------------------
@Override
public void run()
{
    System.out.println("I am the child");
} // End method



} // End class
