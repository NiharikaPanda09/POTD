import java.util.*;
public class CountColorCell {
    public static void main(String[] args) {
    int n = 3;
        System.out.println(coloredCells(n));
    }
    public static long coloredCells(int n) {
     //base case
        if(n == 1) return n;
        long total = 2L *n*(n-1)+ 1;
        return total;
    }
}
