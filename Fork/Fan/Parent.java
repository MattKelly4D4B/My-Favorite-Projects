class Parent
{

public static void main(String[] args)
{
Child myChild;
int childCount;

if (args.length == 1)
{
    childCount = Integer.parseInt(args[0]);
}
else{
    System.out.println("Usage: java Parent <child count>");
    return;
}

    for (int i=1; i <childCount; i++){

        myChild = new Child(i);
        myChild.start();
    }

} // End main


} // End class
