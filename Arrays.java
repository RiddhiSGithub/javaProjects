import java.util.*;
public class Arrays {
    public static void main(String arg[]){
        // defining an array
        // type[] arrayName = new type[size]; or type arrayName[] = new type[size];
        // int[] marks = new int[3];
        int marks[] = new int[3];
        //pleace note array starts from [0][1][2][3]...
        marks[0]=1;
        marks[1]=2;
        marks[2]=3;
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
        // another way to declare array if you already know the size
        int marks1[] = {1,2,3};
        for(int i=0;i<3;i++){
            System.out.println(marks1[i]);
        }
        
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter array length: ");
        // int n = input.nextInt();
        // int user[]=new int[n];
        // for(int i=0;i<n;i++){
        //     System.out.println("Enter number"+i+": ");
        //     user[i] = input.nextInt();
        // }
        // System.out.print("Enter Number you want to find: ");
        // int x = input.nextInt();

        // for(int i=0;i<n;i++){
        //     // System.out.println("user "+i+" : "+user[i]);
        //     if(user[i]==x){
        //         System.out.println("user "+i+" : "+user[i]+" is equal to "+ x);
        //     }
        // }

        // System.out.print("Enter Users length: ");
        // int n = input.nextInt();
        // String userName[]=new String[n];
        // for(int i=0;i<n;i++){
        //     System.out.println("Enter number"+(i+1)+": ");
        //     userName[i] = input.next();
        // }

        // for(int i=0;i<n;i++){
        //         System.out.println("user "+(i+1)+" NAme : "+userName[i]);
        // }

        System.out.print("Enter array length: ");
        int m = input.nextInt();
        int user[]=new int[m];
        for(int i=0;i<m;i++){
            System.out.println("Enter number"+(i+1)+": ");
            user[i] = input.nextInt();
        }

        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            if(user[i]<min){
                min = user[i];
            }else if(user[i]>max){
                max = user[i];
            }
        }
        System.out.println("\n MAX :"+max);
        System.out.println("\n MIN :"+min);
        input.close();
    }
}
