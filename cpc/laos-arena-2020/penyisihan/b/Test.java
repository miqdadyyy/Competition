import java.lang.*;

public class Test {
    public static void main(String[] args) {
        int SUM_TEST_CASE = 100;
        System.out.println(SUM_TEST_CASE);
        for (int CASE = 1; CASE <= SUM_TEST_CASE; ++CASE) {
            int n = (int) (Math.random() * 1000);
            System.out.println(n);
            for (int i = 0; i < n; ++i) {
                int num = (int) (Math.random() * 1000);
                System.out.println(num);
            }
        }
    }
}
