import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	private static final int[] DX = {1, 1, 0, -1, -1, -1, 0, 1};
	private static final int[] DY = {0, 1, 1, 1, 0, -1, -1, -1};

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
		int m = reader.nextInt();
		char[][] grid = new char[n][n];
		for(int i=0; i<n; ++i){
			grid[i] = reader.next().toCharArray();
		}

		boolean foundA = count(grid, m, 'A');
		boolean foundB = count(grid, m, 'B');

		if(foundA)
			if(foundB) System.out.println("Semua Menang");
			else System.out.println("A Menang");
		else
			if(foundB) System.out.println("B Menang");
			else System.out.println("Semua Kalah");

	}

	static boolean count(char[][] grid, int m, char c){
		boolean found = false;
		for (int d=0; d<8; ++d){
			for(int y=0; y<grid.length; ++y){
				for(int x=0; x<grid.length; ++x){
					found = search(x, y, m, c, grid, d);
					if(found) return true;
				}
			}
		}
		return false;
	}

	static boolean search(int x, int y, int m, char c, char[][] grid, int d){
		int count = 0;
		while(x >= 0 && y >= 0 && x < grid.length && y < grid.length){
			if(grid[y][x] == c){
				++count;
			} else {
				count = 0;
			}

	//		System.out.println(d + " : " + x + "," + y + " = " + count + c);

			if(count == m) return true;
			x += DX[d];
			y += DY[d];
		}
		if(count == m) return true;
		return false;
	}

    static void time(long start, long finish) {
        double time = 1.0 * (finish - start) / 1000;
        System.err.printf("Time execution : %.3f seconds \n", time);
    }
}
