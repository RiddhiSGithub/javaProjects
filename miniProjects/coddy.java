import java.util.Scanner;

public class coddy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(;;){
            char c = scanner.nextLine().charAt(0);
            if(c=='e'){ break;}
            float num1 = scanner.nextFloat();
            float num2 = scanner.nextFloat();
            float result;
            scanner.nextLine();
            if(c=='+') {
                System.out.println(num1 + num2);
            }
            else if(c=='-') {
                System.out.println(num1 - num2);
            }
            else if(c=='*') {
                System.out.println(num1 * num2);
            }
            else if(c=='/') {
                System.out.println(num1 / num2);
            } else {
                continue;
            }
        }
    }
}
