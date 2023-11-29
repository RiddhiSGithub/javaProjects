import java.util.*;
public class SecondClass {
    public static void main(String arg[]){

        Scanner input = new Scanner(System.in);
        // System.out.print("Enter your age: ");
        // int age = input.nextInt();
        // if(age>=18){
        //     System.out.println("You are an Adult");
        // }else{
        //     System.out.println("You are not an Adult");
        // }

        // System.out.println("Check if number is even or odd");
        // System.out.print("Enter your Number: ");
        // int number1 = input.nextInt();

        // if(number1%2==0){
        //     System.out.println("You are an Even Number");
        // }else{
        //     System.out.println("You are an Odd Number");
        // }

        // System.out.print("Enater your second number to compare Number1: ");
        // int number2 = input.nextInt();

        // if(number1==number2){
        //     System.out.println("both are Equale.");
        // } else if(number1>number2){
        //     System.out.println("number 1 is Greater than number 2.");
        // } else{
        //     System.out.println("number 1 is Lesser than number 2.");
        // }

        //switch
        // System.out.print("Enter numbrt between number 1-3: ");
        // int greattings = input.nextInt();
        // switch (greattings) {
        //     case 1: System.out.println("Hello");
        //         break;
        //     case 2: System.out.println("Namaste");
        //         break;
        //     case 3: System.out.println("Bonjour");
        //         break;
        //     default: System.out.println("You have entered apar from 1-3");
        // }

        // Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
    	// 1 : + (Addition) a + b
        // 2 : - (Subtraction) a - b
        // 3 : * (Multiplication) a * b
        // 4 : / (Division) a / b
        // 5 : % (Modulo or remainder) a % b    
        // Calculate the result according to the operation given and display it to the user.
        System.out.println("walcome to calculator");
        
        System.out.print("Enter Number1: ");
        int a = input.nextInt();

        System.out.print("Enter Number2: ");
        int b = input.nextInt();

        System.out.print("Which arithmatic opration tou want to perform: ");
        String operation = input.next();
        operation = operation.toLowerCase();

        if(operation.equals("sum") || operation.equals ("add") || operation.equals ("+") || operation.equals ("addition")){
            System.out.println("addition = "+ (a+b) );
        } else if(operation.equals ("minus") || operation.equals ("min") || operation.equals ("-") || operation.equals ("subtraction")){
            System.out.println("substrection = "+ (a-b) );
        } else if(operation.equals ("multi") || operation.equals ("*") || operation.equals ("multiplication")){
            System.out.println("Multiplication = "+ (a*b) );
        } else if(operation.equals ("div") || operation.equals ("divided") || operation.equals ("/") || operation.equals ("division")){
            System.out.println("Divition = "+ (a/b) );
        } else if(operation.equals ("modulo") || operation.equals ("%") || operation.equals ("remainder")){
            System.out.println("substrection = "+ (a%b) );
        } else {
            System.out.println("Invalid Input...");
        }

        // Ask the user to enter the number of the month & print the name of the month. 
        // For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
        System.out.print("Enter thr number of month: ");
        int month = input.nextInt();

        switch (month) {
            case 1:
                System.out.println("this is January");
                break;
            case 2:
                System.out.println("this is February");
                break;
            case 3:
                System.out.println("this is March");
                break;
            case 4:
                System.out.println("this is April");
                break;
            case 5:
                System.out.println("this is May");
                break;
            case 6:
                System.out.println("this is June");
                break;
            case 7:
                System.out.println("this is July");
                break;
            case 8:
                System.out.println("this is August");
                break;
            case 9:
                System.out.println("this is September");
                break;
            case 10:
                System.out.println("this is October");
                break;
            case 11:
                System.out.println("this is November");
                break;
            case 12:
                System.out.println("this is December");
                break;
        
            default: System.out.println("there is only 12 months you idiot");
        }

    }
}
