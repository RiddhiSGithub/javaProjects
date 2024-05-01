
class tempParent{
    int a,b;
    tempParent(int x, int y){
        this.a=x;
        this.b=y;
    }

    public int sum(){
        return a*a+b*b;
    }
}
class child extends tempParent {
    child(int x, int y) {
        super(x, y);
        // The super keyword refers to superclass (parent) objects.
        // It is used to call superclass methods, and to access the superclass constructor.
        // The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.
        
        // The "super" keyword can be used to invoke the parent class methods and constructors. 
        // It can also be used to access the fields of the parent class.
        // The "this" keyword is used to represent the current instance of a class.
        // It is used to access the instance variables and invoke current class methods and constructors.

        //TODO Auto-generated constructor stub
    }

    @Override
    public int sum(){
        return a + b;
    }
}


public class temp {
    public static void main(String[] args) {
        tempParent tp = new child(1, 02);
        System.out.println("sum is: "+tp.sum());
    }
}
