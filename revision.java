import java.util.Scanner;

public class revision {
    public static void main(String[] arg){
        
        Scanner  scanner = new Scanner (System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Which Arithmatic Operation you want to perform?(+,-,*,/):");
        String   operator = scanner.next();

        switch (operator) {
            case "+":
                System.out.println("Answer is "+(firstNumber+secondNumber));
                break;
            case "-":
                System.out.println("Answer is "+(firstNumber-secondNumber));
                break;
            case "*":
                System.out.println("Answer is "+(firstNumber*secondNumber));
                break;
            case "/":
                System.out.println("Answer is "+(firstNumber/secondNumber));
                break;
            default:
                System.out.println("Wrong input");
                break;
        }

        scanner.close();
    }
}
