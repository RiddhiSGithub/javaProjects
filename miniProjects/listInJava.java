import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class listInJava{
    public static void main(String[] args) {
        List<String> Students = new ArrayList<String> ();

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<5 ; i++){
            System.out.print("Enter name-"+i+":");
            String name = scanner.next();
            Students.add(i,name);
            // name = "";
        }
        
        // Removing Elements
        Students.remove("abc");
        Students.remove(3);// This removes the fourth element (index 3)
        Students.remove(3); // This removes the new fourth element (now at index 3, previously at index 4)
        Students.add(3,"Nilaben");
        Students.set(2,"Jayantbhai");//Updating elements

        int count = 0;
        // Searching for elements 
        int index = Students.lastIndexOf("Jayantbhai");
        System.out.println("the Jayantbhai is  on "+ index);

        for (String NAME : Students) {
            if(NAME.equals("Nilaben")){
                count+=1;
            }
        }
        System.out.println("there are "+count+" Nilaben in database.");

        
        for (String name : Students) {
            System.out.println(name);
        }
    }
}