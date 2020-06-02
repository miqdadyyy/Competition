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
		int r = reader.nextInt();
		int c = reader.nextInt();
		String[] dir = reader.nextLine().split(" ");
		int x = reader.nextInt();
		int y = reader.nextInt();
		char[][] grid = new char[r][c];
		for(int i=0; i<r; ++i) Arrays.fill(grid[i], '.');

		fillGrid(dir, grid, c, r, x-1, y-1);
	}

	static void fillGrid(String[] dir, char[][] grid, int c, int r, int x, int y){
		grid[y][x] = '#';
		for(String s : dir) {
			int d = Arrays.asList(DIR).indexOf(s);
			y += DY[d];
			x += DX[d];
			if(!check(x, y, c, r)) {
				System.out.println("Nabrak!");
				return;
			}
			grid[y][x] = '#';
		}

		System.out.println((x+1) + " " + (y+1));
	}

	static boolean check(int x, int y, int c, int r) {
		return x >= 0 && x < c && y >= 0 && y < r;
	}

	static void time(long start, long finish) {
		double time = 1.0 * (finish - start) / 1000;
		System.err.printf("Time execution : %.3f seconds \n", time);
	}
}
