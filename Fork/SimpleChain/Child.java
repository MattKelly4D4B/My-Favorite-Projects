class Child extends Thread
{

private int childNumber;

// ----------------------------------------------
public Child(int childNumber)
{
    this.childNumber = childNumber + 1;

} // End constructor


// ----------------------------------------------
@Override
public void run()
{
    System.out.println("I am child number: " + childNumber);
    if (childNumber <= 9){
    Child myChild = new Child(childNumber);
    myChild.start();
    }
    return;
} // End method

} // End class
