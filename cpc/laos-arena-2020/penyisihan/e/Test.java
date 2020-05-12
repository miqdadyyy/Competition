import java.lang.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        int SUM_TEST_CASE = 100;
        System.out.println(SUM_TEST_CASE);
        for (int CASE = 1; CASE <= SUM_TEST_CASE; ++CASE) {
			int n = (int) (Math.random() * 40) + 3;
			if(Math.random() > 0.4){
				System.out.println(reverse(getSaltString(n)));
			} else {
				System.out.println(getSaltString(n));
			}
        }
    }

	static String getSaltString(int n) {
        String SALTCHARS = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < n) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

	static String reverse(String s){
		String res = s;
		for(int i=s.length()-1; i>=0; --i){
			res += s.charAt(i);
		}
		return res;
	}

}
