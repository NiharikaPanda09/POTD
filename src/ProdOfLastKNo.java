import java.util.*;
public class ProdOfLastKNo {
    public static void main(String[] args) {
        ProductOfNumbers productOfNumbers = new ProductOfNumbers();
        productOfNumbers.add(3);
        productOfNumbers.add(0);
        productOfNumbers.add(2);
        productOfNumbers.add(5);
        productOfNumbers.add(4);
        System.out.println(productOfNumbers.getProduct(2)); // Should print 20 (5*4)
        System.out.println(productOfNumbers.getProduct(3)); // Should print 0 (since 0 was added)
        System.out.println(productOfNumbers.getProduct(1));
    }


    static class ProductOfNumbers {
        private static List<Integer> prefixProd;
        private static int currProd;
        private static int size;

        public  ProductOfNumbers() {
           prefixProd = new ArrayList<>();
           currProd = 1;
           size = 0;
        }

        public static void add(int num) {
       if(num == 0){
           prefixProd = new ArrayList<>();
           currProd = 1;
           size = 0;
       }else{
          currProd *= num;
          prefixProd.add(currProd);
          size++;
       }
        }

        public static int getProduct(int k) {
          if(size == k){
              return prefixProd.get(size-1);
          }
          return size<k?0:prefixProd.get(size-1)/prefixProd.get(size-1-k);
        }
    }
}
