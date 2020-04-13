package Problem_1;

import java.util.Arrays;
import java.util.List;

public class Problem_1 {

    public static void main(String[] args) {
        List lst = Arrays.asList(10, 15, 3, 6);
        checkIfUpTpK(lst, 18);
    }

    private static void checkIfUpTpK(List lst, int k) {
        boolean result = false;
        for (int i = 0; i < lst.size(); i++) {
            for (int j = lst.size() - 1; j >= 0; j--) {
                if ((int) lst.get(i) + (int) lst.get(j) == k) {
                    result = true;
                    break;
                }
            }

        }
        System.out.println(result);
    }


}
