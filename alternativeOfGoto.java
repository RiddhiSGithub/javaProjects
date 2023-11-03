import java.util.Scanner;

public class alternativeOfGoto{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        
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
                    if(i==5){
                        i++;
                        continue;
                    }
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

            //close scanner
            input.close();
        }

      
    }
}