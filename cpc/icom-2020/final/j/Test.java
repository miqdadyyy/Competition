import java.lang.*;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		String[] dir = {"R", "RB", "B", "LB", "L", "LT", "T", "RT"};
		int SUM_TEST_CASE = 100;
		System.out.println(SUM_TEST_CASE);
		for (int CASE = 1; CASE <= SUM_TEST_CASE; ++CASE) {
			int n = (int) (Math.random() * 5) + 995;
			int k = (int) (Math.random() * (n - 3)) + 2;
			System.out.println(n + " " + k);
			for (int i=0; i<n; ++i){
				System.out.print((int) (Math.random()*100000) + " ");
			}
			System.out.println();
		}
	}

	static String shuffleString(String s){
		ArrayList<String> l = new ArrayList<String>(Arrays.asList(s.split("")));
		Collections.shuffle(l);
		String result = "";
		for(String c : l){
			result += c;
		}
		return result;
	}
}
