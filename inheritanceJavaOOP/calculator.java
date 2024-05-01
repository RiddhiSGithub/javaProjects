package inheritanceJavaOOP;
import java.util.Scanner;
class inputNum{
    public String num1,num2;
    //take input
    void takeinput()
    {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter number1: ");
        // this.num1 =sc.nextInt();
        // System.out.println("Enter number2: ");
        // this.num2 =sc.nextInt();
        for(;;){
            System.out.println("Enter number1: ");
            this.num1 =sc.next();
            System.out.println("Enter number2: ");
            this.num2 =sc.next();
            boolean result = true;
            try{
                Integer numString1 = Integer.parseInt(num1);
                Integer numString2 = Integer.parseInt(num2);
            }
            catch(NumberFormatException e){
                System.err.println("\n\n----------------------------------------");
                System.out.println("Invalid Inputs!");
                System.err.println("Please enter only numbers.");
                System.err.println("----------------------------------------\n\n");
                result = false;
            }
            if(result == true){
                break;
            }
        } //for loop  

    }
}

class Arithmatic extends inputNum{
    void sum(){
        takeinput();
        System.out.println("Sum of "+num1+" and "+num2+" is "+Integer.parseInt(num1+num2));
    }
    
    void minus(){
        takeinput();
        int minus =Integer.parseInt(num1)-Integer.parseInt(num2);
        System.out.println("Minus of "+num1+" and "+num2+" is "+minus);
    }

    void multiplication(){
        takeinput();
        int multiplication =Integer.parseInt(num1)*Integer.parseInt(num2);
        System.out.println("Minus of "+num1+" and "+num2+" is "+multiplication);   
    }

    void divide(){
        takeinput();
        int divide =Integer.parseInt(num1)/Integer.parseInt(num2);
        System.out.println("Minus of "+num1+" and "+num2+" is "+divide);   
    }

}

public class calculator {
    public static void main(String[] args) {
        Arithmatic Arith = new Arithmatic();
        Arith.sum();
        Arith.minus();
        Arith.multiplication();
        Arith.divide();
    }
}
