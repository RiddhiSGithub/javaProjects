public class practiceInheritance1 {

    /* Write a Java program to create a class called Animal with a method called makeSound().
     Create a subclass called Cat that overrides the makeSound() method to bark. */

     class Animal{
        public void makeSound(){
            System.out.println("bark");
        }
     }
     class cat extends Animal{
        @Override
        public void makeSound() {
            System.out.println("miyaun");
        }
     }
    public static void main(String[] args) {
        practiceInheritance1 in = new practiceInheritance1();

         cat c = in.new cat();
         c.makeSound();

         Animal a = in.new Animal();
         a.makeSound();
    }
}
