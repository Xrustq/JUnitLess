package task1;

public class Utils {

    public String concatenateWords(String a, String b) {
        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        }

        return a.concat(b);
    }

    public long factorial(int x) {
        if (x < 0 ) throw new ArithmeticException("Negative number");
        if (x == 1 | x == 0)
            return 1;
        return factorial(x - 1) * x;
    }
}
