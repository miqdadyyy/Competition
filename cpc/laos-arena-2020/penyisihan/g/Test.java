import java.lang.*;
import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) {
        int SUM_TEST_CASE = 5;
        System.out.println(SUM_TEST_CASE);
        for (int CASE = 1; CASE <= SUM_TEST_CASE; ++CASE) {
			int n = (int)(Math.random()*9) + 1;
		    int x = (int)(Math.random()*9) + 1;
		    int m = (int)(Math.random()*99) + 1;
		    System.out.println(m);
		    System.out.println(n);
		    System.out.println(x);
        }
	}
}
