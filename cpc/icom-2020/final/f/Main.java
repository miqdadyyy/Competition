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
		String[] skills = reader.next().split("R");
		System.out.println();
		for(String s : skills) System.out.println(getSkill(s));
	}

	static String getSkill(String s){
		int[] letters = new int[26];
		for(char c : s.toCharArray()) letters[c - 'A']++;
		s = "";
		for(int i=0; i<26; ++i) for(int j=0; j<letters[i]; ++j) s += (char) (i + 'A');

		if(s.equals("EEE")){
			return "Sunstrike";
		} else if(s.equals("EEQ")){
			return "Forge Spirit";
		} else if(s.equals("EEW")){
			return "Chaos Meteor";
		} else if(s.equals("EQQ")){
			return "Ice Wall";
		} else if(s.equals("EQW")){
			return "Deafening Blast";
		} else if(s.equals("EWW")){
			return "Alacrity";
		} else if(s.equals("QQQ")){
			return "Cold Snap";
		} else if(s.equals("QQW")){
			return "Ghost Walk";
		} else if(s.equals("QWW")){
			return "Tornado";
		} else {
			return "EMP";
		}
	}

    static void time(long start, long finish) {
        double time = 1.0 * (finish - start) / 1000;
        System.err.printf("Time execution : %.3f seconds \n", time);
    }
}
