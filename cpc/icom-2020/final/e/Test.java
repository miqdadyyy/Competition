import java.lang.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
		String[] numbers = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        int SUM_TEST_CASE = 100;
        System.out.println(SUM_TEST_CASE);
        for (int CASE = 1; CASE <= SUM_TEST_CASE; ++CASE) {
			int n = (int) (Math.random() * 95) + 5;
			String s = "";
			for (int i=0; i<n; ++i){
				s += numbers[(int) (Math.random() * 10)];
			}
			System.out.println(shuffleString(s));
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
