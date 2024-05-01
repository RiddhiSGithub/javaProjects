public class thisJava {
    int a = 10;
    static int b = 15;

    //create a controctor
    thisJava(){
        this(5);
        System.out.println("We are insie of the default constructor.");  
        System.out.println("The value of a = "+ a);  
    }

    // The this() constructor refers to the current class object.
    // It is used for invoking the current class method.
    // 


    
    // The super() constructor refers immediate parent class object.
    // It is used for invoking parent class methods.

    thisJava(int a) {
        this.a = a;
        System.out.println("We are inside of the parameterized constructor.");  
        System.out.println("The value of b = "+b);  
    }
    public static void main(String[] args) {
        new thisJava();
        System.out.println("Inside Main"); 
    }  
}
