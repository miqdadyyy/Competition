import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	private static final int[] DX = {1, 0, -1, 0};
	private static final int[] DY = {0, 1, 0, -1};
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
		int r = reader.nextInt();
		int c = reader.nextInt();
		char[][] grid = new char[r][c];

		for(int i=0; i<r; ++i) Arrays.fill(grid[i], ' ');
	
		System.out.println(grid[0][0]);


		int index = 0;
		int maxIndex = r * c;
		int d = 0;
		int count = 0;
		int x = 0;
		int y = 0;
		while(index < maxIndex){	
			grid[y][x] = (char) (count + 'A');
			count++;
			count %= 26;

			if(!check(x + DX[d], y + DY[d], grid, r, c)){
				d = (d + 1) % 4;
			}
			y += DY[d];
			x += DX[d];
			index++;

		}

		for(char[] ch : grid) System.out.println(new String(ch));
	}

	static boolean check(int x, int y, char grid[][], int r, int c){
		return x >= 0 && x < c && y >= 0 && y < r && grid[y][x] == ' ';
	}

	static void time(long start, long finish) {
		double time = 1.0 * (finish - start) / 1000;
		System.err.printf("Time execution : %.3f seconds \n", time);
	}
}
