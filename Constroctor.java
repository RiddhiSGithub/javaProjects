import java.lang.reflect.Constructor;

public class Constroctor {

    //the Constructor means
    //1. A constructor is a special method in Java that is used to initialize the state of an object when it is created
    //A constructor in Java is similar to a method that is invoked when an object of the class is created.
    // Unlike Java methods, a constructor has the same name as that of the class and does not have any return type.
    //It allows you to initialize objects with specific values, and it can also be used for validation purposes.

    //********************NOTE****************************
    // A constructor cannot be abstract or static or final.
    // A constructor can be overloaded but can not be overridden.

    //Syntax:
    /*public constructor_name(parameter list) {
        statement block;
    }*/

    // Types of Constructor
    // In Java, constructors can be divided into 3 types:
    // - No-arg Constructors (No arguments are passed while creating objects.)
    // - Parametrized Constructors (Arguments are passed while creating objects.)
    // - Default Constructors (Creates and initializes a new object by copying values from another existing object.)

    
    //no arg Constructor public
    // public Constror(){
    //     System.out.println("Contructor Called");
    // }

    // Once a constructor is declared private, it cannot be accessed from outside the class. 
    // So, creating objects from outside the class is prohibited using the private constructor.
    // othervise both are quite similar.

    //no arg Constructor privat
    int i;
    private Constroctor(){
        i = 10;
        System.out.println("Contructor Called " + i);
    }

    // Parametrized Constructor with integer
    public Constroctor(int x){
        this();// by calling this means i am calling the no arg constructor
        System.out.println("Parametrized Constructor called" +x);
    }

    // Parametrize Constroctor with string
    public Constroctor(String s){
        System.out.println("Parametrized String Constructor called "+s);
    }

    // Parametrized Constructor with multiple parameters
    public Constroctor(int x , float y){

        System.out.println("Multiple parametrized Constructor called " +x+y);
    }

    // lets talk about default constructor
    // A default constructor is automatically provided by java compiler if we don't declare any constructor for our own.
    //like
    int a;
    double b;
    boolean c;
    float d;
    char e;
    long f;
    short g;
    byte h;


    public static void main(String[] args) {

        //creating Objects using no argument public constructor
        Constroctor c1 = new Constroctor();
        System.out.println("printin constructocr value "+ c1.i);
        
        //creating Objects using parametrized constructor int
        Constroctor c2 = new Constroctor(56);
        Constroctor c3 = new Constroctor(23);

        //creating Objects using parametrized constructor string
        Constroctor c4 = new Constroctor("Hello Riddhi!");
        
        //creating Objects using parametrized constructor multiple parameter
        Constroctor c5 = new Constroctor(789, 12.3f);

        //A default variable declaration
        Constroctor c6 = new Constroctor();

        System.out.println("A default values of  all variable typr are below:");
        System.out.println("Int :"+c6.a); //0
        System.out.println("Double :"+c6.b);//0.0d
        System.out.println("Boolean :"+c6.c);//false
        System.out.println("Float :"+c6.d);//0.0f
        System.out.println("Char :"+c6.e);//u0000
        System.out.println("Long :"+c6.f);//0L
        System.out.println("Short :"+c6.g);//0
        System.out.println("Byte :"+c6.h);//0
    }
}