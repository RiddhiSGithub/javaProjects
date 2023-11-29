import java.util.*;

public class StringJava {
    public static void main(String arg[]){
        
        Scanner input =new Scanner(System.in);
        // System.out.print("How many name you eant to enter: ");
        // int n = input.nextInt();
        // String[] name = new String[n];
        // for(int i =0; i<3;i++){
        //     System.out.print("Enter name-"+i+1+": ");
        //     name[i] = input.next();
        // }
        // int length = 0;
        // for(int i =0; i<3;i++){
        //     length=length+name[i].length();
        // }
        // System.out.println("the length of array is "+length);
        // input.close();


        //  replacing string words
        String str = "result read ryme";
        String replString = str.replace('r', 'i');
        System.out.println(str);
        System.out.println(replString);
        
        
        // char[] Char = str.toCharArray();
        // for(int i =0;i<str.length();i++){
        //     if( str.charAt(i) == 'r'){
        //     }
        // }
        // System.out.println(str);

        System.out.print("Enter your email: ");
        String email = input.next();
        String email2 = "";
        int n = email.length();
        for(int i = 0; i<n; i++){
            if(email.charAt(i)=='@'){
                break;
            }
            email2 = email2+ email.charAt(i);
        }

        System.out.println("User name:  "+email2);
        


        
    }
}
