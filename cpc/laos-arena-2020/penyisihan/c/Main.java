import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
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
        char[][] matrix = new char[c][r];
        for (int i = 0; i < r; i++) {
            int c_ = count(reader.next());
            char[] arr = new char[c];
            for (int k = 0; k < c; ++k) {
                arr[k] = k < (c - c_) ? '.' : '#';
            }
            matrix = fill(matrix, i, arr);
        }
        System.out.println();
        for (char[] cc : matrix) {
            String s_ = "";
            for (char ccc : cc) s_ += ccc;
            System.out.println(s_);
        }
    }

    static char[][] fill(char[][] target, int column, char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            target[i][column] = arr[i];
        }
        return target;
    }

    static int count(String s) {
        int res = 0;
        for (char c : s.toCharArray()) {
            res = c == '#' ? res + 1 : res;
        }
        return res;
    }


    static void time(long start, long finish) {
        double time = 1.0 * (finish - start) / 1000;
        System.err.printf("Time execution : %.3fs \n", time);
    }
}
