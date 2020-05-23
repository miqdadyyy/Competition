import java.lang.*;

public class Test {
    public static void main(String[] args) {
        int SUM_TEST_CASE = 100;
        System.out.println(SUM_TEST_CASE);
        for (int CASE = 1; CASE <= SUM_TEST_CASE; ++CASE) {
			int n = (int) (Math.random() * 7) + 2;
			int m = (int) (Math.random() * 1000);

			String s = "";
			for(int i=0; i<m; ++i) s += (Math.random() > 0.3 ? '+' : '-');
			System.out.println(n);
			System.out.println(s);
		}
    }
}
