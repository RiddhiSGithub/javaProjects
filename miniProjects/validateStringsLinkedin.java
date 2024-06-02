import java.util.Scanner;

public class validateStringsLinkedin {
    public static boolean isUppercase(String name){
        // All or nothing property "allMatch"
        // you can check if it is in lower case and numberand any thing
        return name.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isPassword(String password){
        // Specific properties "anyMatch"
        // you can check if it is in lower case and numberand any thing
        return password.chars().anyMatch(Character::isUpperCase) 
                && password.chars().anyMatch(Character::isDigit) 
                && password.chars().anyMatch(Character::isLowerCase);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(;;){
            System.out.println("Enter All In UPPERCASE.");
            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            System.out.println("Enter your Password:");
            String password = scanner.nextLine();
            
            if (isUppercase(name)==true && isPassword(password) == true) {
                break;
            }
            System.out.println("Name is not Uppercase or your passwor dose not contain uppercase letter, lowercase letter or number.");

        }
        scanner.close();
    }
}
