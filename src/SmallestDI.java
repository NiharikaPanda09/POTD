import java.util.*;
public class SmallestDI {
    public static void main(String[] args) {
     String s = "IIIDIDDD";
        System.out.println(smallestNumber(s));
    }
    public static String smallestNumber(String pattern) {
      int[] arr = new int[pattern.length()+1];
      for(int i=0;i<pattern.length()+1;i++){
          arr[i] = i+1;
      }
      for(int i=0;i<pattern.length();i++){
          int temp = i;
          while(temp<pattern.length() && pattern.charAt(temp) == 'D'){
              temp++;

          }
          reverse(arr,i,temp);
          if(temp != i){
              i = temp-1;
          }
      }
      return Arrays.toString(arr).replaceAll("\\[|\\]|,|\\s","");

    }
    static void reverse(int [] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
