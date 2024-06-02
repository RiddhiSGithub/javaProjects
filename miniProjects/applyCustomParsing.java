public class applyCustomParsing {
    public static boolean isCharAtEven(String s, char c){
        if(s.isEmpty()){
            return false;
        }
        for (int i = 0; i<s.length();i=i+2) {
            if(s.charAt(i)==c){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isCharAtEven("riddhi", 'h'));
    }
}
