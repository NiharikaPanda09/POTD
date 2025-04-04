import java.util.*;
public class LetterTile {
    public static void main(String[] args) {
     String tiles = "AAB";
        System.out.println(numTilePossibilities(tiles));
    }
    public static int numTilePossibilities(String tiles) {
        int[] freq = new int[26];
        for (char c : tiles.toCharArray()) {
            freq[c - 'A']++;

        }
        return helper(freq);
    }
     public static int helper(int[] freq){
          int cnt = 0;
          for(int i=0;i<26;i++){
              if(freq[i] == 0) continue;
              cnt++;
              freq[i]--;
              cnt += helper(freq);
              freq[i]++;
        }
          return cnt;


    }
}
