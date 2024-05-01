import java.util.*;
public class thirdClass {
    public static void main(String arg[]){
        // for(initialisation; condition; updation){}

        for(int i=0 ; i<5 ; i++){
            System.out.println(i+": for");
        }

        System.out.println("-----------------------");

        int j = 1;
        while(j<5){
            System.out.println(j+": While");
            j++;
        }

        System.out.println("-----------------------");

        int x=1;
        do{
            System.out.println(x+": Do While");
            x++;
        }while(x<5);

        // replacement of goto 
        Scanner input = new Scanner(System.in);
        Boolean result = true;
        do{
            System.out.println("Enter number");
            int a = input.nextInt();
            for(int i=1;i<11;i++){
                System.out.println(a + " * " + i + " = " + (a*i));
            }
            System.out.println("again y/n:");
            String b = input.next();
            if(b.equals("n")){
                result=false;
            }
        }while (result == true);

        // // close the scanner
        // input.close();
        // int sum = 0;
        // for(int i=0;i<5;i++){
        //     sum =sum+i;
        // }
        // System.out.println("the sum of "+sum);
    }
}
