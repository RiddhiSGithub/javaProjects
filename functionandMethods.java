import java.util.*;
public class functionandMethods {
    public static void SayHellow(String name){
        System.out.println("Hello "+name +" How can i halp you today?");
        return ;
    }
    void Say(String name){
        System.out.println("Hello "+name +" Hows Your day?");
        return ;
    }
    int add(int a,int b){
        return a+b;
    }

    static int multiply(int a,int b){
        return a*b;
    }
    static int fectorial(int n){
        for(int i=n-1;i>=1;i--){
            n =n*i;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        SayHellow(name);//with static no need object
        functionandMethods say = new functionandMethods();//without static
        say.Say(name);
        input.close();

        System.out.println("Sum "+say.add(51, 10));
        System.out.println("Multi "+multiply(5, 10));
        System.out.println("Sum "+fectorial(4));

        
    }
}
