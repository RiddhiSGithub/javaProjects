public class StringBuildeJava {
    public static void main(String arg[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // characte at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0 (replacing)
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // adding character in the index
        sb.insert(0,'S');
        System.out.println(sb);

        sb.insert(3,'N');
        System.out.println(sb);

        // delete the extra 'n'
        sb.delete(1,2);
        System.out.println(sb);

        // append to add at last like
        sb.append(" ");
        sb.append("i");
        sb.append("s");
        sb.append(" ");
        sb.append("best.");
        System.out.println(sb.length());

        
    }
}
