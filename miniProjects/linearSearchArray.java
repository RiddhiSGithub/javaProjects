import java.util.Arrays;
import java.util.OptionalInt;

public class linearSearchArray {
    public static int linearSearch(int[] array, int item){
        for (int i : array) {
            if(i==item){
                return i;
            }
        }
        return 0;
    }

    public static OptionalInt linearSearch1(int[] array, int item){
        return Arrays.stream(array).filter(x -> x == item).findFirst();
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(linearSearch(array,8));
        System.out.println(linearSearch1(array,8));

        // if exist it will print number.
        linearSearch1(array, 8).ifPresent(System.out::println);
    }
}   