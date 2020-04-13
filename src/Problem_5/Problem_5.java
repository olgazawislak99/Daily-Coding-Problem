package Problem_5;

public class Problem_5 {

    private static int car(Pair p_cons) {
        return p_cons.getA();
    }

    private static int cdr(Pair p_cons) {
        return p_cons.getB();
    }

    private static Pair cons(int p_a, int p_b) {
        return new Pair(p_a, p_b);
    }

    public static void main(String[] args) {
        Pair pair = cons(3, 4);
        int car = car(pair);
        int cdr = cdr(pair);
        System.out.println("Car of pair is: " + car + "\n");
        System.out.println("Cdr of pair is: " + cdr + "\n");

    }
}
