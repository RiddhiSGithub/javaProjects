import java.util.Scanner;

public class normalizeStringLinkedin {
    public static String normalizeString(String s){
        // trim remove space
        return s.toLowerCase().trim().replace("r", "n");
    }
    public static void printString(){
        String s = "Riddhi";
        // custom parsing to search algorithms
        //Converting String into Array
        // using foreach
        for (char i : s.toCharArray()) {
            System.out.println(i);
        }
        //using for loop
        for(int i = 0; i<s.length();i++){
            System.out.println(s.charAt(i));
        }

    }
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
    
        // System.out.println("Enter your name:");
        // String name = scanner.nextLine();

        // System.out.println("Original");
        // System.out.println(name);
        // System.out.println("After Function");
        // System.out.println(normalizeString(name));

        // // contain case sensative and if d and d are not together is false
        // System.out.println(name.contains("dd"));

        printString();
    }
}
