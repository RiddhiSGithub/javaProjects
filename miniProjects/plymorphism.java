public class plymorphism {
    public static class pet{
        public void voice(){
            System.out.println("unknown");
        }
    }
    public static class cat extends pet{
        @Override
        public void voice(){
            System.out.println("meoow");
        }
    }

    public static class dog extends pet{
        @Override
        public void voice(){
            System.out.println("bark");
        }
    }

    public int multiply(int a,int b){
        return a*b;
    }
    public int multiply(int a,int b,int c){
        return a*b*c;
    }

    public static void main(String[] args) {
        plymorphism poly = new plymorphism();
        pet p = new pet();
        cat c = new cat();
        dog d = new dog();
        p.voice();
        c.voice();
        d.voice();
    
        System.out.println(poly.multiply(3, 5));
        System.out.println(poly.multiply(3, 5,2));
    }
}
