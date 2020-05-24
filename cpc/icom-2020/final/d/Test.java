import java.lang.*;

public class Test {
    public static void main(String[] args) {
        int SUM_TEST_CASE = 100;
        System.out.println(SUM_TEST_CASE);
        for (int CASE = 1; CASE <= SUM_TEST_CASE; ++CASE) {
			int n = (int) (Math.random() * 97) + 3;
			System.out.println(n);
			for(int i=0; i<n; ++i){
				for (int j=0; j<n; ++j){
					System.out.print((Math.random() > 0.15 ? '.' : '*'));
				}
				System.out.println();
			}
			int x = (int) (Math.random() * n);
			int y = (int) (Math.random() * n);
			System.out.println(x + " " + y);
		}
    }
}
