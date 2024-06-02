public class runningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int a = 0;

        for (int i=0; i<nums.length;i++) {
            prefixSum[i] = a+=nums[i];
        }
        return prefixSum;
    }
    public static void main(String[] arg){
        int[] nums = {1,2,3,4};
        runningSumOf1dArray sum = new runningSumOf1dArray();
        System.out.println(sum.runningSum(nums));
    }
}
