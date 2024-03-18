import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Main o = new Main();

        String haystack = "sadbutye";
        String needle = "ye";

        System.out.println(o.strStr(haystack,needle));
    }


    public int strStr(String haystack, String needle) {


        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {

            if (haystack.charAt(i) == needle.charAt(0) ) {
               if(haystack.startsWith(needle, i)){
                   return i;
               }
            }
        }
        return -1;

    }
}