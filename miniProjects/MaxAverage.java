public class MaxAverage {

    public double maximumAverageSubarray(int[] number, int k){
        int n = number.length;
        double maxAverage;
        double currentSum = 0;

        // Calculate sum of the first k elements
        for (int i = 0; i < k; i++) {
            currentSum += number[i];
        }

        // Initialize maxAverage with the average of first k elements
        maxAverage = currentSum / k;

        // Slide the window and update maxAverage
        for (int i = k; i < n; i++) {
            currentSum += number[i] - number[i - k]; // Slide the window by adding next element and removing first element
            maxAverage = Math.max(maxAverage, currentSum / k);
        }

        return maxAverage;
    }

    public static void main(String[] arg){
        int[] number={1,12,-5,-6,50,3};
        int k = 4;

        MaxAverage MA = new MaxAverage();
        System.out.println(MA.maximumAverageSubarray(number, k));
    }
}
