import java.util.*;
public class WordSubsets {
    public static void main(String[] args) {
  String [] words1 = {"amazon","apple","facebook","leetcode"};
  String[] words2 = {"e","o"};
        System.out.println(wordSubsets(words1,words2));
    }
    public static List<String> wordSubsets(String[] words1, String[] words2) {
        //array storing key and val or calculating frequency like this
        List<String> list = new ArrayList<>();
         int[] maxFreq = new int[26];
         for(String s:words2){
             int []fre = getFrequency(s);
             for(int i=0;i<26;i++){
                 maxFreq[i] = Math.max(fre[i],maxFreq[i]);
             }
         }
          for(String str:words1){
              int[] freq = getFrequency(str);

                  if(isUniversal(freq,maxFreq)){
                   list.add(str);

              }
          }
          return list;

        }



    private static int[] getFrequency(String word){
        int [] freq = new int[26];
        for(char c:word.toCharArray()){
            freq[c - 'a']++;
        }
        return freq;
    }
    private static boolean isUniversal(int[] freq1,int[] freq2){

        for(int i=0;i<26;i++){
            if(freq2[i] > freq1[i]) return  false;
        }
        return true;
    }

}

