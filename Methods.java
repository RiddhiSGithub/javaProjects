public class Methods {

   //two type of methods:
    //1.user define methods: created by user as per their needs
    //2.standerd library methods : already defined in java sdk or jre (ex: toString(), equals())


    //by using static , it can br accessed without creating an object
    //creating a method with static
    public static int addition(int a,int b){
        return a+b;//return value
    }

    //creating a method with non-static
    public int sum(int a,int b){
        int add = a + b;
        return add;//return variable
    }

    //creating method without parameters
    public void display(){
        System.out.println("Hello World!");
    }
    //creating method with parameters
    public void greetings(String name){
        System.out.print("Hello "+name);
    }


    //calling the above created method in main function
    public static void main(String[] args) {

        //calling the method with static
        System.out.println("The sum of 5 and 3 is: "+addition(5,3));

        //calling the method with non-static
        //creating an object of the class
        Methods obj = new Methods();
        obj.sum(5, 10);
        System.out.println(obj.sum(5, 10));

        //calling method without parameters
        Methods methObj = new Methods();
        methObj.display();

        //calling method with parameters
        Methods metObj = new Methods();
        metObj.greetings("Riddhi");


        //below are example of standard library methods
        // using the sqrt() method
        double num = Math.sqrt(49);
        System.out.println("Square root of 49 is " +num);


        //using the abs() method
        int number = -27;
        int result = Math.abs(number);
        System.out.println("Absolute Value of -27 is " +result);


        //using pow() method
        double baseNum = 5;
        double exponent = 2;
        double powerResult = Math.pow(baseNum,exponent);
        System.out.println("Power of 5 to 2 is " +powerResult);

        //using min() method
        int a=6, b=9, c=3;
        int minVal = Math.min(a,b);
        System.out.println("Minimum value between a & b is " +minVal);


        //using max() method
        int x=6, y=9, z=3;
        int maxVal = Math.max(x,y);
        System.out.println("Maximum value between x & y is " +maxVal);


        //using round() method
        double valToBeRounded = 13.5;
        int roundedValue = (int)Math.round(valToBeRounded);
        System.out.println("The rounded off value is "+roundedValue);

        //making all string in capital latter
        String str="Hello World!";
        String upperStr = str.toUpperCase();
        System.out.println("String after converting it into uppercase: "+upperStr);

        //making all string in small latter
        String lowerStr = str.toLowerCase();
        System.out.println("String after converting it into lowercase: "+lowerStr);

        //cheking is if it is  equal or not
        boolean checkEqual = str.equalsIgnoreCase("hello world!");
        System.out.println("Is the given string equals to 'hello world!'? :"+checkEqual);
    }    
}