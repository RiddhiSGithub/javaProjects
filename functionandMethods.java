import java.util.*;
public class functionandMethods {
    // Function no need object to declare or call
    public static void SayHellow(String name){
        System.out.println("Hello "+name +" How can i halp you today?");
        return ;
    }
    // methods need object to declare or call
    void Say(String name){
        System.out.println("Hello "+name +" Hows Your day?");
        return ;
    }

    // methods need object to declare or call
    int add(int a,int b){
        return a+b;
    }

    // Function no need object to declare or call
    static int multiply(int a,int b){
        return a*b;
    }
    // Function no need object to declare or call
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
        SayHellow(name);//with static no need object (function)
        functionandMethods say = new functionandMethods();//without static (method)
        say.Say(name);
        input.close();

        System.out.println("Sum "+say.add(51, 10));
        System.out.println("Multi "+multiply(5, 10));
        System.out.println("Sum "+fectorial(4));

        
    }
}
