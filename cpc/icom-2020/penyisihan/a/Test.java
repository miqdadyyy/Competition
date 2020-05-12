import java.lang.*;

public class Test {
    public static void main(String[] args) {
        int SUM_TEST_CASE = 100;
        System.out.println(SUM_TEST_CASE);
        for (int CASE = 1; CASE <= SUM_TEST_CASE; ++CASE) {
            int a = 0, b = 0;
            String s = "";
            while ((a < 21 && b < 21) || (Math.abs(a - b) <= 1)) {
                if (Math.random() > 0.5) {
                    ++a;
                    s += "A";
                } else {
                    ++b;
                    s += "B";
                }
            }
            System.out.println(s);
            System.err.println(a + " " + b);
        }
    }
}
