public class reverseTheString {
    public static String reverseString(String s){
        if(s.isEmpty()){System.out.println(s);}
        StringBuilder reversed = new StringBuilder();
        for(int i = s.length()-1; i>=0;i--){
            reversed.append(s.charAt(i));

        }
        System.out.println(reversed);
        return reversed.toString();
    }
    public static String reverseString1(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public static String eachWordReverse(String sentance){
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for(int j = 0; j<sentance.length();j++){
            char c = sentance.charAt(j);
            if(c != ' '){
                word.append(c);
            } else {
                result.append(word.reverse().toString());
                result.append(" ");
                word.setLength(0);//clear word string builder
            }
        }
        result.append(word.reverse().toString());
        return result.toString();
    }
    public static void main(String[] args) {
        // System.out.println(reverseString("Riddhi"));
        // System.out.println(reverseString1("Riddhi"));
        System.out.println(eachWordReverse("Riddhi is good"));
    }
}
