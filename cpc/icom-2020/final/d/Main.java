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
		char[][] grid = new char[n][n];
		for(int i=0; i<n; ++i){
			grid[i] = reader.next().toCharArray();
		}
		int x = reader.nextInt();
		int y = reader.nextInt();

		if(grid[y][x] == '*') {
			System.out.println("You Ded!!!");
		} else {
			grid = openRecursive(grid, x, y);
			System.out.println();
			for(char[] c : grid) System.out.println(new String(c));
		}		
	}

	static char[][] openRecursive(char[][] grid, int x, int y){
		int curr = countBomb(grid, x, y);
		if(curr == 0){
			grid[y][x] = '0';
			for(int d=0; d<8; ++d){
				if(checkEdge(x + DX[d], y + DY[d], grid) && grid[y + DY[d]][x + DX[d]] == '.'){
					grid = openRecursive(grid, x + DX[d], y + DY[d]);
				}
			}
		} else {
			grid[y][x] = (char) (curr + '0');
		}
		return grid;
	}

	static int countBomb(char[][] grid, int x, int y){
		int count = 0;
		for(int d=0; d<8; ++d) {
			if(checkEdge(x + DX[d], y + DY[d], grid)){
				count = grid[y + DY[d]][x + DX[d]] == '*' ? count + 1 : count;
			}
		}
		return count;
	}

	static boolean checkEdge(int x, int y, char[][] grid){
		return x >= 0 && x < grid.length && y >= 0 && y < grid.length;
	}

    static void time(long start, long finish) {
        double time = 1.0 * (finish - start) / 1000;
        System.err.printf("Time execution : %.3f seconds \n", time);
    }
}
