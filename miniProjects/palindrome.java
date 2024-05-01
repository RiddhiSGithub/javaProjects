public class palindrome {
    public static void main(String[] arg){
        String palindromeString = "abcbba";
        boolean ispalindrome = true;
        int i = 0;
        int j = palindromeString.length()-1;

        while (i<j){
            if(palindromeString.charAt(i) != palindromeString.charAt(j)){
                System.out.println("This is not palindrome.");
                ispalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if(ispalindrome == true){
            System.out.println("This is palindrome.");
        }
    }
}
