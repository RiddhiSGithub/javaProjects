public class MethodOverloading {

    // *method overloading means having more than one methods with the same name in a java program.
    // *Two or more methods can have the same name inside the same class if they accept different arguments. This feature is known as method overloading.
    // *Method overloading is achieved by either:
    // 1.changing the number of arguments.
    // 2.or changing the data type of arguments.
    // *It is not method overloading if we only change the return type of methods. There must be differences in the number of parameters.



    // example:
    //creating same name four methods but diffrent parameters
    void display(){
        System.out.println("no parameter");
    }
    void display(int a) {
        System.out.println("Displaying int: " + a);
    }
    void display(String s) {
        System.out.println("Displaying String: " + s);
    }
    void display(double d){
        System.out.println("Displaying double: "+d);
    }

    public static void main(String[] args) {
        
        //no parameter method
        MethodOverloading obj = new MethodOverloading();
        obj.display();

        //method with integer as parameter
        obj.display(10);

        //method with string as parameter
        obj.display("Hello World!");

        //method with double as parameter
        obj.display(34.56789);
    }
}
