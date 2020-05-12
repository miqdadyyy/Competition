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
        char[][] matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = reader.next().toCharArray();
		}
        System.out.println();

		for(int i=0; i<n; ++i)
			for(int j=0; j<n; ++j)
				if(matrix[i][j] != '*') matrix[i][j] = (char) (countBomb(j, i, matrix) + ((int) '0'));

		for(char[] cc : matrix)
			System.out.println(new String(cc));

   	}

	static int countBomb(int x, int y, char[][] matrix){
		int count = 0, n = matrix.length;
		for(int d=0; d<8; ++d){
			if(check(x + DX[d], y + DY[d], matrix)) ++count;
		}
		return count;
	}

	static boolean check(int x, int y, char[][] matrix){
		return x >= 0 && y >= 0 && x < matrix.length && y < matrix.length ? (matrix[y][x] == '*' ? true : false) : false;
	}

    static void time(long start, long finish) {
        double time = 1.0 * (finish - start) / 1000;
        System.err.printf("Time execution : %.3fs \n", time);
    }
}
