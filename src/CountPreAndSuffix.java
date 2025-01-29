import java.util.*;
public class CountPreAndSuffix {
    public static void main(String[] args) {
    String [] words = {"a","aba","ababa","aa"};
        System.out.println(countPrefixSuffixPairs(words));
    }
    public static int countPrefixSuffixPairs(String[] words) {
        int cnt = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {

                    if (i!=j && isPrefixAndSuffix(words[i], words[j])) {
                        cnt++;
                    }
                }
            }

    return cnt;

    }
    private static boolean isPrefixAndSuffix(String str1,String str2){
        return str2.startsWith(str1) && str2.endsWith(str1);

    }
}
