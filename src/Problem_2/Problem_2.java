package Problem_2;

import java.util.Arrays;
import java.util.List;


/*Given an array of integers, return a new array such that each element at index i of the new array
 is the product of all the numbers in the original array except the one at i.*/

public class Problem_2 {
    private static void findProduct(List<Integer> lst) {
        int tmp = 1;
        for (Integer i : lst) {
            tmp *= i;
        }
        for (int j = 0; j < lst.size(); j++) {
            Integer a = tmp / lst.get(j);
            lst.set(j, a);
            System.out.println(lst.get(j));
        }

    }

    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5);
        findProduct(lst);
    }
}


