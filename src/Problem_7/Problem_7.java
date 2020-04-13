package Problem_7;

import java.util.ArrayList;

public class Problem_7 {
    private static int countDecoding(ArrayList<Character> digits, int n){
        if(n == 0 || n==1){
            return 1;
        }
        if(digits.get(0) == '0'){
            return 0;
        }

        int count = 0;

        if(digits.get(n-1) > '0'){
            count=countDecoding(digits, n-1);
        }

        if(digits.get(n-2)=='1' || (digits.get(n-2)=='2' && digits.get(n-1) < '7')){
            count += countDecoding(digits, n-2);
        }

        return count;
    }

    public static void main(String[] args){
        ArrayList<Character> digits = new ArrayList<Character>();
        digits.add('1');
        digits.add('2');
        digits.add('3');
        digits.add('4');
        int n = digits.size();
        System.out.println(countDecoding(digits,n));

    }
}
