public class roundNum {
    public static int roundFloat(float num) {
        // Write code here
        double x = (double)num;
        return (int)x;
    }
    public static void main(String[] args) {
        System.out.println(roundFloat(0.62f));
    }
}
