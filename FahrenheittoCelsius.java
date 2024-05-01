import java.util.Scanner;

public class FahrenheittoCelsius {
    //Program to convert temperature from Fahrenheit to Celsius.
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        while(true){
                double celsius;
                String numString;
                System.out.println("Fahrenheit to Celsius Conversion Table\n");
                Boolean bool = true;
                for(;;){
                    System.out.print("Enter Temperature in Fahrenheit : ");
                    numString = input.next();
                        try {
                            Double num = Double.parseDouble(numString);
                                
                        } catch (NumberFormatException e) {
                        System.out.println(numString + " is not a number.\nAdd Proper Number.");
                        bool = false;
                    }
                    if(bool == true){
                        Double num = Double.parseDouble(numString);
                        celsius = (num - 32) * 5 / 9;
                        System.out.printf("%.2f degrees Fahrenheit equals %.2f degrees Celsius.", num, celsius);
                        break;
                    }
                
                }//for loop
                
                System.out.println("\nDo you want to continue? Y/N");
                char choice = input.next().charAt(0);
                if(choice != 'Y' && choice !='y'){
                    break;
                }
                    
            }
        input.close();
    }
}