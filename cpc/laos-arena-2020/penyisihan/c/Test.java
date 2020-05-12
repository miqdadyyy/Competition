import java.lang.*;

public class Test {
    public static void main(String[] args) {
        int SUM_TEST_CASE = 100;
        System.out.println(SUM_TEST_CASE);
        for (int CASE = 1; CASE <= SUM_TEST_CASE; ++CASE) {
            int r = (int) (Math.random() * 97) + 3;
            int c = (int) (Math.random() * 97) + 3;
            System.out.println(r + " " + c);
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    char c_ = Math.random() > 0.5 ? '#' : '.';
                    System.out.print(c_);
                }
                System.out.println();
            }
        }
    }
}
