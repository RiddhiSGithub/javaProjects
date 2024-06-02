public class minimumValueToGetPositiveSum {
    public int minStartValue(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int startValue = 0;
        for(int i = 1;;i++){
            int a=i;
            int count = 0;
            for (int j = 0; j<nums.length; j++) {
                prefixSum[j]= a+= nums[j];
                if(prefixSum[j]<=0){
                    break;
                }
                count++;
            }
            if(count== nums.length){
                startValue = i;
                break;
            }         
        }
        return startValue;
    }
    public static void main(String[] args) {
        int[] nums ={1,2};
        minimumValueToGetPositiveSum minValue = new minimumValueToGetPositiveSum();
        System.out.println(minValue.minStartValue(nums));
    }

}
