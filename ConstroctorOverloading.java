public class ConstroctorOverloading {

    String name;
    //Java Constructor Overloading

    // Constroctor without perameter
    ConstroctorOverloading(){
        this.name="Riddhi";
    }
    // Constroctor with one parameter
    ConstroctorOverloading(String name){
        System.out.println("This is the constructor with parameter");
        this.name=name;
    }
    // Constroctor with two parameters
    ConstroctorOverloading(int age,String name){
        System.out.println("This is the constructor with two parameters");
        this.name = "Age : "+age+" Name: "+name;
    }
    void displayName() {
        System.out.println("The Name of the person is "+this.name);
    }

    public static void main(String[] args) {
        
        // call constructor with no parameter
        ConstroctorOverloading obj1 = new ConstroctorOverloading();
        obj1.displayName();

        // // call constructor with one parameter
        ConstroctorOverloading obj2 = new ConstroctorOverloading("Rudra");
        obj2.displayName();

        ConstroctorOverloading obj3 = new ConstroctorOverloading("Nupur");
        obj3.displayName();

        ConstroctorOverloading obj4 = new ConstroctorOverloading("Jayantbhai");
        obj4.displayName();

        ConstroctorOverloading obj5 = new ConstroctorOverloading("Nilaben");
        obj5.displayName();


    }
}