import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nameString;
        //ask name and store in arry
        System.out.println("Enter your name or santance for palindrom:");
        nameString = input.nextLine();
        //close scanner
        input.close();

        // nameString = nameString.toLowerCase();
        StringBuilder reversedNameString = new StringBuilder(nameString);
        reversedNameString.reverse();

        System.out.println(reversedNameString);
    }
}
