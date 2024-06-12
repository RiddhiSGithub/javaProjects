import java.util.Scanner;

// you were getting below error:
/* No enclosing instance of type miniCalculator is accessible.
Must qualify the allocation with an enclosing instance of type miniCalculator
(e.g. x.new A() where x is an instance of miniCalculator). */

// because 
/* The error you're encountering is because you are trying to instantiate inner classes
(takeNumber and summary) without an instance of the enclosing class (miniCalculator).
In Java, non-static inner classes require an instance of their outer class to be instantiated. */

// In Java, an enclosing class (also known as an outer class) is a class that contains another class

// to sove that error you can Make the inner classes static or
// Create an instance of the outer class first

public class miniCalculator {
    public static class takeNumber{
        int num1;
        int num2;
        Scanner scane = new Scanner(System.in);
        void takeNumbers(){
            // take number
            System.out.print("Enter number1:");
            num1 = scane.nextInt();
            System.out.print("Enter number2:");
            num2 = scane.nextInt();
        }
    }
    
    public static class summary extends takeNumber{
        public void plus(){
            takeNumbers();
            int sum = this.num1 + this. num2;
            System.out.println("Sum of two numbers are "+sum);
        }
    }

    class min extends takeNumber{
        public void minus(){
            takeNumbers();
            int min = this.num1 - this. num2;
            System.out.println("Minus of two numbers are "+min);
        }
    }
    
    // if you dont want to use static
    public static void main(String[] args) {
        // with static
        // summary s = new summary();
        // s.plus();

        // // without static 
        // miniCalculator calculator = new miniCalculator();
        // min m = calculator.new min();
        // m.minus();

        int num =1;
        num+=num;
    }
}
