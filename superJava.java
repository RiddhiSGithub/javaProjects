class Birdes{
    // create an atribute
    String fly = "can fly";
    //lets create an constrector
    Birdes(){
        System.out.println("Ths is the bird one");
    }
}

class newBirds extends Birdes{
    // creating an atribute
    String fly = "cannot fly";
    //lets create an constrector
    newBirds(){
        System.out.println("Ths is the new bird one");
        System.out.println("Parrot "+ super.fly);
        System.out.println("Chicken "+fly);
    }
}

class oldBirds extends newBirds{
    //create an constroctor 
    oldBirds(){
        super();
        System.out.println("This is the old bird one...");
    }
}

public class superJava {
    public static void main(String[] args) {
        new newBirds();
        System.out.println("--------------------------------------------------------");
        new oldBirds();
        System.out.println("this is the man one");
    }
}
