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
        
        int value=First+second;
        System.out.print(value+", ");
        First = second;
        second = value;
        for(int i=0; i<n-3; i++){
            printFibonacci(i, First, second);
        }
    }
    
    public static void main(String arg[]){
        int n=1;
        printName(n);

        printSum(1);

        printSum1(1,10,0);

        printFectorial(1, 4, 1);

        int First = 0, second = 1;
        System.out.print(First+", ");
        System.out.print(second+", ");
        printFibonacci(10, First,second);
    }
}