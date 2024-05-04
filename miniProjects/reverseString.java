public class reverseString {
    public void reverse(char[] s) {
        int i=0;
        int j = s.length - 1;
        char tempChar;
        
        while(i<j){
            tempChar = s[i];
            s[i] = s[j];
            s[j] = tempChar;
            i++;
            j--;
        }
    }
    public static void main(String[] arg){
        char[] charString = {'a','b','c','d'};

        reverseString rString = new reverseString();
    
        rString.reverse(charString);
        System.out.println(charString);
    }
}
