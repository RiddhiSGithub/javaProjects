import java.util.Scanner;

public class recursionConcept {

    public static void printName(int n){
        if(n>5){
            return;
        }
        System.out.println(n);
        printName(n+1);
    }
    public static int sum=0;
    public static void printSum(int n){
        if(n<7){
            sum+=n;
            printSum(n+1);     
        } else {
            System.out.println(sum);
            return;
        }
    }
    public static void printSum1(int n, int x, int sum1){
        if(n<x){
            sum1+=n;
            printSum1(n+1,x,sum1);     
        } else {
            System.out.println(sum1);
            return;
        }
    }

    public static void printFectorial(int n, int x, int fecto){
        if(n<=x){
            fecto*=n;
            printFectorial(n+1, x, fecto);
        } else {
            System.out.println(fecto);
            return;
        }
    }

    public static void printFibonacci(int n,int First, int second){
        
        if(n==0){
            System.out.println();
            return ;
        }
        int value=First+second;
        First = second;
        second = value;
        System.out.print(value+", ");
        printFibonacci(n-1, First, second);       
    }
    
    public static void printXrestn(int x, int n, int total){
        
        if (n==0){
            System.out.println("Awswer is "+ total);
            return ;
        }
        total*=x;
        printXrestn(x, n-1, total);
    }
    public static void main(String arg[]){
        int n=1;
        printName(n);

        printSum(1);

        printSum1(1,10,0);

        printFectorial(1, 4, 1);

        int First = 0, second = 1, x= 10;
        System.out.print(First+", ");
        System.out.print(second+", ");
        printFibonacci(x-2, First,second);
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int m = input.nextInt();
        System.out.print("Enter the Power: ");
        int l = input.nextInt();
        printXrestn(m, l, 1);
        input.close();
    }
}