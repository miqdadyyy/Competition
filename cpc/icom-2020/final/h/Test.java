import java.lang.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
		String[] dir = {"R", "RB", "B", "LB", "L", "LT", "T", "RT"};
        int SUM_TEST_CASE = 100;
        System.out.println(SUM_TEST_CASE);
        for (int CASE = 1; CASE <= SUM_TEST_CASE; ++CASE) {
			int n = (int) (Math.random() * 100) + 5;
			int r = (int) (Math.random() * 95) + 5;
			int c = (int) (Math.random() * 95) + 5;
			String s = "";
			for(int i=0; i<n; ++i){
				int index = (int) (Math.random() * 8);
				s += dir[index] + " ";
			}
			System.out.println(n + " " + r + " " + c);
			System.out.println(s);
			System.out.println(((int) (Math.random() * c) + 1) + " " + ((int) (Math.random() * r) + 1));
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
