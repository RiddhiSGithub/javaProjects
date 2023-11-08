import java.util.Arrays;
import java.util.List;

public class JavaString {
    public static void main(String[] args) {
        // lets create simple string
        System.out.println("Hello World!");
        
        // creating a new string object using the constructor of the class 'String'
        // String str = "This is my first Java program!";
        String str = "Riddhi";
        System.out.println(str);

        //Java string operation
        //get length of string
        int lengthOfStr = str.length();
        System.out.println("\nLength of the given string: "+lengthOfStr);

        //checking if string is empty or not
        boolean checkEmpty = str.isEmpty();
        System.out.println("\nIs the string empty? :"+checkEmpty);

        //connecting two strings
        String concatStr1 = "Welcome to ";
        String concatStr2 = "My First Programming Class.";
        String resultConcat = concatStr1 + concatStr2;
        System.out.println("\nThe concatenated string is: "+resultConcat);


        //comparing strings
        // compareTo()
        String compairStr1 = "riddhijain";
        String compairStr2 = "riddhii";
        int comparisonResult = compairStr1.compareTo(compairStr2);
        System.out.println("\nComparison Result between riddhijain and riddhii: "+comparisonResult);
        
        //compareToIgnoreCase()
        String compareStr1 = "Riddhi";
        String compareStr2 = "Ridhisha";
        int comparisonResult1 = compareStr1.compareToIgnoreCase(compareStr2);
        System.out.println("\nComparison Result of two Strings: "+comparisonResult1);

        //equal string
        boolean equalStrings = compareStr1.equals(compareStr2);
        System.out.println("\nAre these two strings equal? :"+equalStrings);

        //equalsIgnoreCase()
        String equalStr1 = "java";
        String equalStr2 = "JAVA";
        boolean equalsResult = equalStr1.equalsIgnoreCase(equalStr2);
        System.out.println("\nAre both strings equal (case insensitive)? : "+equalsResult);

        //Escape character in Java Strings
        String escapeChar = "\t\b\r\f\\\"\'";
        System.out.println("\nEscape characters are used for special characters like \t, \b, \r, \f and \\For double quotes \" we use \", For single quote ' we use \'");
        System.out.println("\nEscape Character Example:\n"+escapeChar);

        // In Java, strings are immutable. This means, once we create a string, we cannot change that string.
        // To make changes to it, we need to use StringBuilder and then convert it back into a string.
        // Let's see how this works.
        StringBuilder sb = new StringBuilder();
        sb.append("I am ");
        sb.append("learning");
        sb.append(" Java.");
        String finalString = sb.toString();
        System.out.println("\nFinal String after appending: "+finalString);

        //use concat
        String Example = "Hello";
        Example = Example.concat(" World");
        System.out.println("\nUsing Concatenation: "+Example);

        //Substring example
        //what substring do is, it returns a part of the original string between the specified begin index and end index (inclusive).
        //it returns a part of the original string based on index value passed as parameter
        //in java, indexes start from 0
        String substringExample = "Hello World!";
        System.out.println("\nSubstring from index 7 to 10 (excluding): "+substringExample.substring(6,9));

        //trim the string
        //what trim do is, it removes any leading spaces at the beginning of the string
        //and also trims trailing spaces at the end of the string
        String trimmedString = "   Hello World!   ";
        System.out.println("\nTrimed String: "+trimmedString.trim());

        //contains()
        //this method checks if the given string contains another string or not
        //returns true if yes else false
        String containCheck = "This is an example.";
        System.out.println("\nDoes 'example' exist in the sentence? "+containCheck.contains("example"));
    
        //join()
        //joins all elements of array/list with specified delimiter
        // try this on list topic

        //replace()
        //replaces all occurrences of old char with new char
        //for example
        String str2 = "The quick brown fox jumps over the lazy dog.";
        System.out.println("\nOriginal String: "+str2);
        System.out.println("\nReplaced String: "+str2.replace('o', 'a'));
        
        //replaceAll()
        //replaces all occurrences of regex with replacement string
        //for example
        String str3 = "The quick brown fox jumps over the lazy dog.";
        System.out.println("\nOriginal String: "+str3);
        System.out.println("\nReplaced String: "+str3.replaceAll(".", "*"));
    
        //replaceForst()
        //replaces only first occurrence of regex with replacement string
        //for example
        String str4 = "The quick brown fox jumps over the lazy dog.";
        System.out.println("\nOriginal String: "+str4);
        System.out.println("\nReplaced String: "+str4.replaceFirst(".", "*"));

        // charAt()
        //returns character at specific position
        // for example
        String str5 = "Hello World!";
        System.out.println("\nCharacter at Index 8: "+str5.charAt(7));

        // getBytes()
        //converts string into bytes and stores them in byte array
        //for example
        String str6 = "Hello World!";
        byte[] bArray = str6.getBytes();
        System.out.println("\nByte Array: ");
        for (byte byt : bArray) {
            System.out.print(byt+" ");
        }

        // indexOf()
        // returns index of substring, -1 if it does not exists
        // for example
        String str7 = "Hello World!";
        int idx = str7.indexOf("W");
        System.out.println("\nIndex of W: "+idx);

        // lastIndexOf()
        // returns index of last occurance of substring, -1 if it does not exist
        // for example
        String str8 = "Hello World!";
        int lIdx = str8.lastIndexOf("l");
        System.out.println("\nLast Index of l: "+lIdx);

        // format()
        // formats a string using given arguments
        // for example
        double dblNum = 90.5;
        String formattedString = String.format("%.5f",dblNum);//90.50000
        System.out.println("\nFormatted Double Number: "+formattedString);
        
        // split()
        // splits a string based on delimiter
        // for example
        String str9 = "This is my String to be split";
        String[] arrStr = str9.split(" ");
        System.out.println("\nSplit String: ");
        for (String s : arrStr){
            System.out.println(s);
        }

        //toLowerCase()
        // converts all characters to lowercase
        // for example
        String str10 = "HELLO WORLD!";
        System.out.println("\nConverted Lower Case String: "+str10.toLowerCase());

        //toUpperCase()
        // converts all characters to uppercase
        // for example
        String str11 = "hello world!";
        System.out.println("\nConverted Upper Case String: "+str11.toUpperCase());

        //matches()
        // checks whether the regular expression matches or not
        // for example
        String regexPattern = "[a-z]";
        boolean bMatches = str2.matches(regexPattern);
        System.out.println("\nDoes '"+str2+"' match with pattern [a-z]: "+bMatches);
        
        //startswith()
        // checks whether the string starts with specified prefix or not
        // for example
        boolean bStartWith = str3.startsWith("The");
        System.out.println("\nDoes '"+str3+"' start with The: "+bStartWith);
        //endswith()
        // checks whether the string ends with specified suffix or not
        // for example
        boolean bEndsWith = str4.endsWith(".java");
        System.out.println("\nDoes '"+str4+"' end with .java: "+bEndsWith);
    }
}