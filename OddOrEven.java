import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.err.println("lets check if number is Even or Odd:");
                
            for(;;){
                System.out.println("Enter a number:");
                String num = input.next();
                boolean result = true;
                try{
                    Integer numString = Integer.parseInt(num);
                }
                catch(NumberFormatException e){
                    System.out.println("Invalid Input!");
                    result = false;
                }
                if (result == true && num.length() > 0){
                    int n = Integer.parseInt(num);
                    if ((n % 2 == 0)){
                        System.out.println(n + " is even.");
                        break;
                    } 
                    else {
                        System.out.println(n + " is odd.");
                    }
                }
            } //for loop   
            
            //ask user if they want to it again
            System.out.print("\ndo you want to continue? y/n : ");
            String choice = input.next();
            if(!choice.equalsIgnoreCase("y")){
                break;
            }//if close
        }//while loop
        //close scanner
        input.close();
    }//main method
}//class
