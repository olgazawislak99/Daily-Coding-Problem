package Problem_4;

import java.util.ArrayList;
import java.util.Collections;

public class Problem_4 {

    private static int findMissing(ArrayList<Integer> lst) {
        int miss = 1;
        int tmp = 0;
        Integer max = findMax(lst);
        miss = max - 1;

        for (Integer i : lst) {
            if (i == miss) {
                tmp = miss - 1;
                break;
            }
        }
        miss = tmp;
        if (tmp <= 0) {
            miss = max + 1;
        }
        return miss;
    }

    private static Integer findMax(ArrayList<Integer> lst) {
        return Collections.max(lst);
    }

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(0);
        lst.add(1);
        lst.add(2);
        System.out.println(findMissing(lst));

    }
}
