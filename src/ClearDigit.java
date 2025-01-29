import java.util.*;
public class ClearDigit {
    public static void main(String[] args) {
      String s = "ab12";
        System.out.println(" " + clearDigits(s));
    }
    public static String clearDigits(String s) {
         StringBuilder st = new StringBuilder();
         for(char dig:s.toCharArray()){
            if(Character.isDigit(dig)) {
                if (!st.isEmpty()) {
                    st.deleteCharAt(st.length() - 1);
                }
            }
            else {
                    st.append(dig);
                }

         }
         return st.toString();
    }
}
