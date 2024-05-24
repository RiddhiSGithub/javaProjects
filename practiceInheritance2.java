public class practiceInheritance2 {

    /* Write a Java program to create a class called Vehicle with a method called drive(). 
    Create a subclass called Car that overrides the drive() method to print "Repairing a car". */

    static class vehical{
        public void drive(){
            System.out.println("drive");
        }
    }
    static class car extends vehical{
        @Override
        public void drive(){
            System.out.println("Repairing a car");
        }
    }
    public static void main(String[] args) {
        vehical v = new vehical();
        v.drive();
        car c = new car();
        c.drive();
    }
}
