import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	private static final int[] DX = {1, 1, 0, -1, -1, -1, 0, 1};
	private static final int[] DY = {0, 1, 1, 1, 0, -1, -1, -1};
	private static final String[] DIR = {"R", "RB", "B", "LB", "L", "LT", "T", "RT"};

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new
					InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) {
		FastReader reader = new FastReader();
		int SUM_TEST_CASE = reader.nextInt();
		long startTime = System.currentTimeMillis();
		for (int CASE = 1; CASE <= SUM_TEST_CASE; CASE++) {
			System.out.printf("CASE #%d: ", CASE);
			solve(reader, CASE);
		}
		long endTime = System.currentTimeMillis();
		time(startTime, endTime);
	}

	static void solve(FastReader reader, int CASE) {
		int n = reader.nextInt();
		int k = reader.nextInt();
		int[] a = new int[n];

		for(int i=0; i<n; ++i) a[i] = reader.nextInt();
		Arrays.sort(a);
		int min = Integer.MAX_VALUE;
		int current_n = k - 1;
		while(current_n < n){
			min = Math.min(min, (a[current_n] - a[current_n - (k-1)]));
			current_n++;
		}
		System.out.println(min);
	}

	static void time(long start, long finish) {
		double time = 1.0 * (finish - start) / 1000;
		System.err.printf("Time execution : %.3f seconds \n", time);
	}
}
