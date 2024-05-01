public class KeywordsInJava {

    // what is "this" means in java
    private String name;

    public void setName(String name){
        this.name = name;
    }

    //get mether
    public String getName(){
        return this.name;
    }


    // Java Recursion
    //  a method that calls itself is known as a recursive method. And, this process is known as recursion.
    //  A recursive function is one which calls itself during its execution.
    static int factorial(int n){
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }
    //creating another recursive function
    static int power(int base, int exponent){
        if (exponent == 0)
            return 1;
        else
        return base*power(base,exponent - 1);
    }

    static int sum(int a,int b){
        System.out.println("a + b");
        return a+b;
    }
    
    public static void main(String[] args) {
        System.out.println("This is a java program");
        
        // Create an object of the class 'ThisJava' and call its methods using dot operator (.)
        KeywordsInJava obj1 = new KeywordsInJava(); 
        obj1.setName("riddhi Makwana");
        // Printing the value of the variable 'name' in the method 'main()'
        System.out.println("The value of the variable 'name' in the method 'main()' is: " + obj1.getName());

        

        //********************************************************************************************************** */
        // In Java, the final keyword is used to denote constants. It can be used with variables, methods, and classes.
        // Once any entity (variable, method or class) is declared final, it can be assigned only once. That is,
        // the final variable cannot be reinitialized with another value
        // the final method cannot be overridden
        // the final class cannot be extended
        
        final int age = 10;
        System.err.println("this is age using final: "+age);
        // remove comment and use it.
        // age = 5;
        // System.err.println("after changing the value of age to 5: "+age);


        //calling recursive function
        System.out.println("Factorial of 4 is :"+factorial(4));
        System.out.println("Power of 2 is :"+power(2,3));
        System.out.println("sum of two numbers is:"+sum(6,7));


        // Java instanceof Operator
        // The instanceof operator in Java is used to check whether an object is an instance of a particular class or not.
        String name ="Riddhi";
        boolean result = name instanceof String;
        System.out.println("Is Riddhi instance of string? "+result);

        Integer numObj = 2;
        boolean result2 = (numObj instanceof Integer);
        System.out.println("Is numObj an instance of Integer? " + result2);
    }

}