public class ObjectOrientedPrograming {
    public static void main(String[] args) {
        
        //file name is person.java
        //create an object of data, and hear is human
        person human = new person();

        //access the private veriable using the getter and setter
        human.setName("Riddhi");
        System.out.println(human.getName());

        //file name is Animal.java
        //accessing the public class
        Animal animal = new Animal();

        //accesing the public variable
        animal.animalName = "Cookie";

        System.out.println(animal.animalName+" is an animal name.");

        //you can also create an method in class(check in Animal.java) like this one
        animal.show();
    }
}
