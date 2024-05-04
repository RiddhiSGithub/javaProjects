// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].

public class squaresOfASortedArray {
    public void squareOfArray(int[] array){
        for(int i =0; i<array.length; i++){
            array[i] = array[i] * array[i];
            array[i] = Math.abs(array[i]);
        }

        int storeNum;
        for(int i=0; i<array.length ;i++){
            for(int j=0; j<array.length ;j++){
                if (array[i]<array[j]) {
                    storeNum = array[i];
                    array[i] = array[j];
                    array[j] = storeNum;
                }
            }
        }
    }   

    public static void main(String[] arg){

        int[] testNum = {-1, 5, -3, 4};

        squaresOfASortedArray sArray = new squaresOfASortedArray();
        sArray.squareOfArray(testNum);
        
        for (int i : testNum) {
            System.out.print(i+" ");
        }
    }
}
