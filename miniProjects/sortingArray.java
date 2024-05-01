public class sortingArray{
    public static void main(String[] arg){
        //  This is like finding target not shorting array
        // int[] num ={1, 2, 4, 6, 8, 9, 14, 15};
        // boolean isTarget = false;
        // int i = 0, j = num.length-1;
        // while (i<j) {
        //     if(num[i] + num[j] <13){
        //         i++;
        //     } else if (num[i] + num[j] >13) {
        //         j--;
        //     } else {
        //         isTarget = true;
        //         break;
        //     }
        // }
        // if(isTarget==true){
        //     System.out.println("Target has been Founded.");
        // } else {
        //     System.out.println("Target has not been Founded.");
        // }

        int[] numbers = {1,5,9,4,2,7,3,8,6};
        int storeNum;
        for(int i=0; i<numbers.length ;i++){
            for(int j=0; j<numbers.length ;j++){
                if (numbers[i]<numbers[j]) {
                    storeNum = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = storeNum;
                } else {
                    continue;
                }
            }
        }

        for (int num : numbers) {
            System.out.print(num+", ");
        }
    }
}