// File name should be java.java thats whya its class name is also java
// Java is case sencetive

// In order to use the object of Scanner, we need to import java.util.Scanner package.
import java.util.Scanner;


public class java {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.println("Hello Riddhi makwana!");

    /* System is a built-in Java class that contains useful tools for our programs.
     out is short for “output”.
     println is short for “print line”
    */

    // We can use System.out.println() whenever we want the program to create a new line on the screen after outputting a value
    System.out.println("Let's play hide and seek.");
    // System.out.print(). Notice that we’re using print(), not println(). Unlike System.out.println(), this type of print statement outputs everything on the same line
    System.out.print("Three...");
    System.out.print("Two...");
    System.out.println("One...");
    System.out.println("Ready or not, here I come!");


    //one line comment
    /*Multiple line comments */
    System.out.println("Java is a class-based language.");
    System.out.println("Java classes have a 'main' method.");
    System.out.println("Java statements end with a semicolon.");

    System.out.println("Programming is... fun!");


    int speedLimet;
    speedLimet=10;
    speedLimet=22;
    System.out.println("My speed limit is "+speedLimet);

    String myName ="Riddhi";
    boolean result = myName instanceof String;
    if (result==true){
      System.out.println("I am an instance of the class String");
    }
    else{
        System.out.println("I am NOT an instance of the class String");
    }

    // create an object of Scanner
  // here we are taking input 
  Scanner input = new Scanner(System.in);
  // taking input from user.
  System.out.println("Enter your Age: ");
  int age = input.nextInt();
  System.out.println("AGE :" + age);
  // Taking name as an input
  System.out.println("Enter Your Name : ");
  String name = input.next();
  System.out.println("NAME : " + name);

  if(0<=age && age<=10){
    System.out.println(name + " are a child");
  }
  else if(11<=age && age <=20){
    System.out.println(name + " are a teenager");
    }
    else if(age>20) {
      System.out.println(name + " are an adult");
    }
    else{
      System.out.println("Invalid age entered");
    }
    
    // lets make calculator
    double num1,num2;
    String Arithmatic;
    //adding number validation
    System.out.print("Enter first number: ");
    num1 = input.nextDouble();
    System.out.print("Enter second number: ");
    num2 = input.nextDouble();

    System.out.print("Please select Arithmatic operator(from: +,-,*,/): ");
    Arithmatic = input.next();

    switch (Arithmatic) {
      case "+":
      System.out.printf("Sum %f", num1+num2);
      break;
      case "-":
      System.out.printf("Difference %f", num1-num2);
      break;
      case "*":
      System.out.printf("Multipication %f", num1*num2);
      break;
      case "/":
      if(num2!=0)
      System.out.printf("Division %f", num1/num2);
      else
      System.out.println("Division by zero is not possible.");
      default:
      System.out.println("Invalid Operator Entered!");
      }

      //make an interview form
      int q3,q4;
      String q1,q2;
      System.out.println("\nInterview Form\n");
      System.out.println("Q1: What's your name?");
      q1=input.next();
      System.out.println("Q2: Where do you live?");
      q2=input.next();
      System.out.println("Q3: How old are you?");
      q3=input.nextInt();
      System.out.println("Q4: Do you have any siblings?");
      q4=input.nextInt();

      //review your awnsers
      System.out.println("\nAnswers:\nName:"+q1+"\nAge:"+q3+"\nAddress:"+q2+"\nSiblings"+q4);


      // table of user input number

      // i create an infinite loop as an alternative of goto
      
      for(;;){
        String numString;
        System.out.print("Enter the number of table: ");
        numString = input.next();
        Boolean bool = true;
        
        try {
            Double num = Double.parseDouble(numString);
            System.out.println(numString + " is a number");
            int i=1;
            do{
              System.out.println(num + " " + " * " + " " + i + " = " + num * i);
              i++;
            }while(i<11);
        } catch (NumberFormatException e) {
            System.out.println(numString + " is not a number.\nAdd Proper Number.");
            bool = false;
        }
        if(bool == true){
          break;
        }
      }

      

          
          
  

    // closing the scanner object
    input.close();
    
  }
}