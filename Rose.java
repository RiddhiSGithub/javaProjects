public class Rose extends Flower{

    //see Flower.java we are using protective Access Modifier
    public static void main(String[] args) {
        //create an object of rose
        Rose myRose = new Rose();
        //access the method using dot operator
        myRose.view();
    }    
}