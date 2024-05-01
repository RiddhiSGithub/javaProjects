package inheritanceJavaOOP;
import java.util.Scanner;
public class parentclass {
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
