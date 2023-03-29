import java.util.*;
public class haystack{

    private static int strStr(String haystack, String needle) {
        
        if (haystack == null || needle == null) {
            return -1;
        }
        
        if (haystack.equals(needle)) {
            return 0;
        }
        
        int needleLength = needle.length();
        
        for (int i = 0; i < haystack.length() - needleLength + 1; i++) {
            
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));

        haystack = "aaaaa";
        needle = "bba";
        System.out.println(strStr(haystack, needle));

        haystack = "";
        needle = "";
        System.out.println(strStr(haystack, needle));

        haystack = "abc";
        needle = "c";
        System.out.println(strStr(haystack, needle));
    }
}