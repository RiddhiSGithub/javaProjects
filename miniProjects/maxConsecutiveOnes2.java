public class maxConsecutiveOnes2 {
    /* Given a binary array nums and an integer k, 
    return the maximum number of consecutive 1's in the array 
    if you can flip at most k 0's. */
    public static int maxConsecutiveOnes(int[] nums, int k){
        int pointer=0;
        int count=0;
        int max = 0;
        int K = k;
        
        for(int i = 0; i<nums.length;i++){
            k=K;
            breakThis:
            for(int j = pointer; j<nums.length; j++){
                if(nums[j]==0){
                    count++;
                    k--;
                    if (k==-1) {
                        i=j;
                        count--;
                        pointer++;
                        break breakThis;
                    }
                    continue;
                }
                count++;
            }
            max = Math.max(max, count);
            count = 0;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(maxConsecutiveOnes(nums, k));
    }
}
