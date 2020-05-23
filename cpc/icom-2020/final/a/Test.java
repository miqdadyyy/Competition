import java.lang.*;

public class Test {
    public static void main(String[] args) {
        int SUM_TEST_CASE = 100;
        System.out.println(SUM_TEST_CASE);
        for (int CASE = 1; CASE <= SUM_TEST_CASE; ++CASE) {
			int n = (int) (Math.random() * 98) + 2;
			int m = (int) (Math.random() * n);
			double consta = Math.random();
			System.out.println(n + " " + m);
			for(int i=0; i<n; ++i){
				for(int j=0; j<n; ++j)
					System.out.print((Math.random()) > consta ? 'A' : 'B');
				System.out.println();
			}
		}
    }
}
