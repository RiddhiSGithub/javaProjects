class slidingWindow{

    //create function to select range in array
    public int[] arrayRange(int start,int end,int[] array){

        int[] finalArray = new int[((end+1)-start)];
        if (end==start){
            finalArray[0] = array[start];
            return finalArray;
        }
        int j = 0;
        for(int i = start; i<end+1 ; i++){
            if (j<=((end+1)-start)){
                finalArray[j] = array[i];
                j++;
            }
        }
        return finalArray;

    }

    public void findSubarray(int[] num, int k){
        int left =0;
        int store = 0;
        // int[] show= new int[10];
        for(int right=0;right<num.length;right++){
            store += num[right];
            while (store>k) {
                store-=num[left];
                left++;
            }
            if(left>right){
                continue;
            }
            slidingWindow fWindow = new slidingWindow();
            // show = fWindow.arrayRange(left, right, num);
            for (int number : fWindow.arrayRange(left, right, num)) {
                System.out.print(number+" ,");
            }
            System.out.print(" : ");
        }
    }
    
    public static void main(String[] args) {
        
        int[] num = {1,5,8,1,4,7};
        int k = 7;
        slidingWindow fSlidingWindow = new slidingWindow();
        fSlidingWindow.findSubarray(num,k);
    }
}