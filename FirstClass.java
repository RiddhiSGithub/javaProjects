import java.util.*;

class FirstClass{
    public static void main(String arg[]){

        //output
        System.out.println("Hello Riddhi with java\nI am Intelligent.");
        
        // print the pattern
        // *
        // **
        // ***
        // ****
        // *****
        // ans1  
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");
        // ans2
        System.out.print("*\n* *\n* * *\n* * * *\n* * * * *\n" );

        // variables:
        String name = "Riddhi";
        int a = 25;
        int b = 10;
        double price = 20.23;
        int sum = a+b;
        int diff = a-b;
        System.out.println("Sum: "+sum);
        System.out.println("Diff: "+ diff);
        System.out.println("Multi: "+(a*b));

        // Inputs
        // like for o/p System.out here for i/o is System.in
        // Scanner Inputs = new Scanner(System.in);
        // System.out.print("Enter name: ");
        // String Name = Inputs.next();
        // // next() only take one line but nextLine() to take whole line
        // // nextInt()
        // // nextFloat()
        // System.out.println("Hi "+ Name +", How are you?");

        Scanner Inputs = new Scanner(System.in);
        // lets write simple sum program with taking input
        System.out.print("Enter number 1: ");
        int x = Inputs.nextInt();
        // System.out.println("------------------");
        System.out.print("\nEnter Number 2: ");
        int y = Inputs.nextInt();

        int addition = x + y;
        System.out.print("\nTotal sum is "+ addition);
    }
}