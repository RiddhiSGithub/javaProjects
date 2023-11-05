import java.util.Scanner;
public class hi {
    public static void main(String[] args) {
        // creating "n" arry string
        int arreyLength = 3;
        String[] firstName = new String[arreyLength];
        String[] lastName = new String[arreyLength];
        String[] age = new String[arreyLength];


        //scan user name 
        Scanner scanner = new Scanner(System.in);
        String username;

        //create a loop to add
        for(int i = 0;i<=firstName.length;i++){
            if(i==firstName.length){
                System.out.println("this block is full.");
                break;
            }
            do {
                System.out.println("Enter your username:");
                username = scanner.nextLine();

                //checking if user input is empty...
                if (username.isEmpty()) {
                    System.out.println("The Username is empty. Please try again.");
                }
            } while (username.isEmpty());
            firstName[i] = username;
            //ask last name
            System.out.println("Enter your lastname:");
            String surname = scanner.nextLine();
            lastName[i] = surname;
            //ask age
            for(;;){
                System.out.println("Enter your Age:");
                String ages = scanner.nextLine();
                Boolean bool = true;
                try {
                    Double num = Double.parseDouble(ages);   
                    age[i]=ages;                 
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Input.\nAdd Proper Input.");
                    bool = false;
                }
                if(bool == true){
                    break;
                }
            }
            
        }
        //print the result
        for (int i = 0;i<firstName.length;i++) {
            System.out.println("User Details:");
            System.out.println("    User-"+(i+1)+" Name is "+firstName[i]+".");
            System.out.println("    User-"+(i+1)+" Lastname is "+lastName[i]+".");
            System.out.println("    User-"+(i+1)+" Age is "+age[i]+".");
            }
        //close the scanner
        scanner.close();
    }
}
