public class maximumAverageSubarray {

    public double maxAverage(int[] number, int k){
        int[] finalArray = new int[k];
        int hold,temp1,temp2;
        double average;
        int sum = 0;
        for(int i=0; i<number.length;i++){
            for(int j = (i+1); j<number.length;j++){
                if (number[i]<0) {
                    temp1 = number[i] * (-1);
                    if(temp1<number[j]){
                        hold = number[i];
                        number[i] = number[j];
                        number[j] = hold;
                    }
                } else if (number[j]<0) {
                    temp2 = number[j] * (-1);
                    if(number[i]<temp2){
                        hold = number[i];
                        number[i] = number[j];
                        number[j] = hold;
                    }
                } else if (number[i]<0 || number[j]<0) {
                    temp1 = number[i] * (-1);
                    temp2 = number[j] * (-1);
                    if(temp1<temp2){
                        hold = number[i];
                        number[i] = number[j];
                        number[j] = hold;
                    }
                } else if(number[i]<number[j]){
                    hold = number[i];
                    number[i] = number[j];
                    number[j] = hold;
                }
            }
        }
        for(int i=0; i <finalArray.length ; i++){
            finalArray[i] = number[i];
        }
        for (int i : finalArray) {
            sum = i+sum;
        }
        System.out.println(sum);
        average = (double)sum/k;
        System.out.println(average);

        return average;
    }

    public static void main(String[] args) {
        int[] ary={1,12,-5,-6,50,3};
        int k = 4;

        maximumAverageSubarray max = new maximumAverageSubarray();
        System.out.println(max.maxAverage(ary, k));
    }
}
