import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class aggregateFilterArrays {

    public static int[] finEvenNums(int[] arr1, int[] arr2){
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer int1 : arr1) {
            if(int1%2==0){
                result.add(int1);
            }
        }
        for (Integer int2 : arr2) {
            if(int2%2==0){
                result.add(int2);
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] finEvenNums1(int[] arr1, int[] arr2){
        IntPredicate isEvPred = num -> num % 2 ==0;
        return Stream.of(arr1,arr2).flatMapToInt(Arrays::stream)
        .filter(isEvPred)
        .toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {-9,3,2,-8,12,-16};
        int[] arr2 = {0,-3,-8,35,40,20,7};

        Arrays.stream(finEvenNums(arr1, arr2)).forEach(System.out::println);
        System.out.println();
        Arrays.stream(finEvenNums1(arr1, arr2)).forEach(System.out::println);

        // in 2nd : Reverse an array in java
    }
}
