import java.util.Scanner;
public class hi {
    public static void main(String[] args) {
        // creating 100 arry string
        String[] array = new String[5];

        //scan user name 
        Scanner scanner = new Scanner(System.in);

        //create a loop to add
        for(int i = 0;i<=array.length;i++){
            if(i==array.length){
                System.out.println("this block is full.");
                break;
            }
            System.out.println("Enter your username:");
            String username = scanner.nextLine();
            array[i] = username;
        }
        //print the result
        for (int i = 0;i<array.length;i++) {
            System.out.println("User-"+(i+1)+" Name is "+array[i]+".");
            }
        //close the scanner
        scanner.close();
    }
}
