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
		String s = reader.next();
		int[] res = findNumbers(s);
		String ans = "";
		for(int i=0; i<res.length; ++i){
			for(int j=0; j<res[i]; j++) ans += i;
		}
		System.out.println(ans);
	}

	static int[] findNumbers(String s){
		int[] res = new int[10];
		int[] letters = new int[26];
		for(char c : s.toCharArray()) letters[c-'A']++;

		while(letters['Z' - 'A'] > 0){
			letters['Z' - 'A']--;
      		letters['E' - 'A']--;
      		letters['R' - 'A']--;
      		letters['O' - 'A']--;
      		res[0]++;
    	}

		while(letters['G' - 'A'] > 0){
			letters['E' - 'A']--;
		  	letters['I' - 'A']--;
			letters['G' - 'A']--;
			letters['H' - 'A']--;
		  	letters['T' - 'A']--;
		  	res[8]++;
		}

		while(letters['W' - 'A'] > 0){
		  	letters['T' - 'A']--;
		  	letters['W' - 'A']--;
		  	letters['O' - 'A']--;
		  	res[2]++;
		}

		while(letters['X' - 'A'] > 0){
		  	letters['S' - 'A']--;
		  	letters['I' - 'A']--;
		  	letters['X' - 'A']--;
		  	res[6]++;
		}

		while(letters['T' - 'A'] > 0){
		  	letters['T' - 'A']--;
		  	letters['H' - 'A']--;
		  	letters['R' - 'A']--;
		  	letters['E' - 'A']--;
		  	letters['E' - 'A']--;
		  	res[3]++;
		}

		while(letters['S' - 'A'] > 0){
		  	letters['S' - 'A']--;
		  	letters['E' - 'A']--;
		  	letters['V' - 'A']--;
		  	letters['E' - 'A']--;
		  	letters['N' - 'A']--;
		  	res[7]++;
		}

		while(letters['V' - 'A'] > 0){
		  	letters['F' - 'A']--;
		  	letters['I' - 'A']--;
		  	letters['V' - 'A']--;
		  	letters['E' - 'A']--;
		  	res[5]++;
		}

		while(letters['F' - 'A'] > 0){
		  	letters['F' - 'A']--;
		  	letters['O' - 'A']--;
		  	letters['U' - 'A']--;
		  	letters['R' - 'A']--;
		  	res[4]++;
		}

		while(letters['O' - 'A'] > 0){
		  	letters['O' - 'A']--;
		  	letters['N' - 'A']--;
		  	letters['E' - 'A']--;
		  	res[1]++;
		}

		while(letters['N' - 'A'] > 0){
		  	letters['N' - 'A']--;
		  	letters['I' - 'A']--;
		  	letters['N' - 'A']--;
		  	letters['E' - 'A']--;
		  	res[9]++;
		}
		return res;
	}

    static void time(long start, long finish) {
        double time = 1.0 * (finish - start) / 1000;
        System.err.printf("Time execution : %.3f seconds \n", time);
    }
}
