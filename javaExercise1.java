import java.util.*;
public class javaExercise1 {

    public static double average(int a,int b, int c){
        double avg =(a+b+c)/3;
        return avg;
    }//average
    public static int sumOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        return sum;
    }//sumOdd
    public static void graterNum(int a,int b){
        if(a>b){System.out.println(a+" is grater than "+ b);} 
        else if(a<b){System.out.println(a+" is less than "+ b);}
        else {System.out.println(a+" is equal to "+ b);}
    }// graterNum
    public static double circumference(double radius){
        double Circumference = 2*3.14*radius;
        return Circumference;
    }//circumference 
    public static void voter(int age){
        if(age>18){System.out.println("You are eligible to vote.");}
        else{System.out.println("You are NOT eligible to vote.");}
    }//voter
    public static int power(int a,int b){
        int power=1;
        for(int i=1;i<=b;i++){
            power=power*a;
        }
        return power;
    }//power
    public static void Fibonacci(int a){
        int first = 0, second = 1;
        System.out.print(first+", "+second+", ");
        for (int i = 2; i < a; i++) {
            int next = first+second;
            System.out.print(next+", ");
            first=second;
            second=next;
        }
    }// Fibonacci

    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);

        //  Enter 3 numbers from the user & make a function to print their average.
        System.out.print("Enter your number1: ");
        int a = input.nextInt();
        System.out.print("Enter your number2: ");
        int b = input.nextInt();
        System.out.print("Enter your number3: ");
        int c = input.nextInt();
        System.out.println("The avarage of "+a+", "+b+" and "+c+" is "+average(a, b, c)+".");

        // Write a function to print the sum of all odd numbers from 1 to n.
        System.out.print("take number and sum of odd number till N: ");
        int d = input.nextInt();
        System.out.println("the sum of odd numbers is "+sumOdd(d)+".");

        // Write a function which takes in 2 numbers and returns the greater of those two.
        graterNum(a, b);

        // Write a function that takes in the radius as input and returns the circumference of a circle.
        System.out.print("take radius to calulate circumference of a circle: ");
        double radius = input.nextDouble();
        System.out.println("the circumference is "+ circumference(radius)+".");

        // Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
        System.out.print("Enter your Age: ");
        int age = input.nextInt();
        voter(age);

        // // Write an infinite loop using do while condition.
        // int j=1;
        // do{
        //     System.out.println(j);
        //     j++;
        // }while(j>0);

        // Write a program to enter the numbers till the user wants and at the end 
        // it should display the count of positive, negative and zeros entered. 
        int positive=0,negative=0,zeros=0;
        boolean ask=true;
        do{
            System.out.print("Enter number:");
            int number = input.nextInt();
            if(number>0){positive = positive+1;}
            else if(number<0){negative = negative+1;}
            else{zeros = zeros+1;}
            System.out.print("Do you want to enter another number(y/n):");
            String ans = input.next();
            if(ans.equals("n")){
                ask=false;
            }
        }while(ask==true);
        System.out.println("Entered\nPositive numbers: "+positive+"\nNegative number: "+negative+"\nZeroes number: "+zeros);

        // Two numbers are entered by the user, x and n. 
        // Write a function to find the value of one number raised to the power of another i.e. xn.
        System.out.print("Enter your base Number: ");
        int base = input.nextInt();
        System.out.print("Enter your Power Number: ");
        int power = input.nextInt();
        System.out.println("The "+base+"^"+power+" is "+power(base, power)+".");

        // Write a function that calculates the Greatest Common Divisor of 2 numbers.


        // Write a program to print Fibonacci series of n terms where n is input by user :
        // 0 1 1 2 3 5 8 13 21 ..... 
        System.out.print("Enter your Number for fibonacci series: ");
        int Fibonacci = input.nextInt();
        Fibonacci(Fibonacci);

        input.close();

    }//main
}
