class Animal {
    public  void speak() {
        System.out.println("This is the overridden method");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("This is the override method for Dog");
    }
}

public class overriderJava {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();

        Dog dog = new Dog();
        dog.speak();
    }
}
