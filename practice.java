public class practice {
    public int maxNumber(int[] numbers){
        int maxNum = 0;
        for (int i : numbers) {
            maxNum = Math.max(maxNum, i);
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] numbers = {5,6,798,465,168,845};
        practice mPractice = new practice();
        System.out.println(mPractice.maxNumber(numbers));
    }
}
