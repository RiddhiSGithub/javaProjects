public class maxConsecutiveOnes{
    /* Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
    Any answer with a calculation error less than 10-5 will be accepted.
    Input: nums = [1,12,-5,-6,50,3], k = 4*/

    public Double maxAverage(int[] numArray, int k){
        Double output = 0.0;
        Double sum = 0.0;

        for(int i = 0; i<k ; i++){
            sum += numArray[i];
        }
        output = sum/k;

        for(int i = k; i<numArray.length;i++){
            sum-= numArray[i-k];
            sum += numArray[i];
            output = Math.max(output, sum/k);
        }
        return  output;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        maxConsecutiveOnes max = new maxConsecutiveOnes();
        System.out.println(max.maxAverage(nums, k));

    }

}