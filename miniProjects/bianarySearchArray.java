import java.util.Arrays;

public class bianarySearchArray {

    public static boolean bianarySearch (int[] arr, int item){
        int min = 0 ;
        int max = arr.length-1;

        while (min<=max) {
            int mid = (min + max) /2;
            if(item == arr[mid]){
                return true;
            } else if (item<arr[mid]){
                max = mid - 1; 
            } else {
                min = mid + 1; 
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        System.out.println(bianarySearch(arr, 8));

        // inbuilt function binary search function in java
        Arrays.binarySearch(arr,2);
    }
}
