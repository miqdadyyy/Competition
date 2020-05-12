public class Test {
    public static void main(String[] args) {
        int SUM_TEST_CASE = 100;
        System.out.println(SUM_TEST_CASE);
        for (int CASE = 1; CASE <= SUM_TEST_CASE; ++CASE) {
			int n = (int)(Math.random()*99995) + 5;
		    System.out.println(n);
        }
	}
}
