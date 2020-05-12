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
        Stack stack = new Stack();
        int N = reader.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = reader.nextInt();
        }
        for (int i = N - 1; i >= 0; i--) {
            stack.push(a[i]);
        }
        s(stack);
        System.out.println();
    }

    static void s(Stack s2) {
        if (s2.size() == 0) {
            return;
        } else if (s2.size() == 1) {
            System.out.print(s2.pop() + " ");
        } else if (s2.size() == 2) {
            System.out.print(s2.pop() + " ");
            System.out.print(s2.pop() + " ");
        } else {
            Stack s1 = new Stack();
            Stack s3 = new Stack();
            int n = s2.size() / 3;
            for (int i = 0; i < n; i++) {
                s1.push(s2.pop());
            }
            for (int i = 0; i < n; i++) {
                s3.push(s2.pop());
            }

            s(s1);
            s(s2);
            s(s3);
        }
    }

    static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    static void time(long start, long finish) {
        double time = 1.0 * (finish - start) / 1000;
        System.err.printf("Time execution : %.3fs \n", time);
    }
}
