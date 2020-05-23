import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	private static final int[] DX = {1, 0, -1, 0};
	private static final int[] DY = {0, 1, 0, -1};

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
		String mid = "";

		for(int i=0; i<m; ++i) mid += (i%2 == 0 ? '#' : '.');

		System.out.println();

		for (int i=0; i<n; ++i){
			if(i == 0 || i == n-1){
				String res = "";
				for(int j=0; j<m; ++j){
					if(i == 0){
						res += j%4 == 1 ? '.' : '#';
					} else {
						res += j%4 == 3 ? '.' : '#';
					}
				}
				System.out.println(res);
			} else {
				System.out.println(mid);
			}
		}
	}

    static void time(long start, long finish) {
        double time = 1.0 * (finish - start) / 1000;
        System.err.printf("Time execution : %.3f seconds \n", time);
    }
}
