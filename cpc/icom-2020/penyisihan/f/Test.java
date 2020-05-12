import java.lang.*;
import java.util.*;
import java.io.*;

public class Test {
	static ArrayList<String> WORDLISTS;
    public static void main(String[] args) {
		WORDLISTS = new ArrayList<String>();
        int SUM_TEST_CASE = 100;

		try {
			BufferedReader fileReader = new BufferedReader(new FileReader("../../../___outsource/wordlist.txt"));
			String line;
			while((line = fileReader.readLine()) != null){
				WORDLISTS.add(line);
			}

			fileReader.close();
		} catch(Exception e){
			e.printStackTrace();
		}

        System.out.println(SUM_TEST_CASE);
        for (int CASE = 1; CASE <= SUM_TEST_CASE; ++CASE) {
			System.out.println(generateDirty());
        }
    }

	static String generateDirty(){
		int wordsCount = (int) (Math.random() * 10) + 3;
		String res = "";
		while(wordsCount-- > 0)
			res += randomCase(WORDLISTS.get((int)(Math.random() * WORDLISTS.size()))) + " " + generateSymbols();
		return res;
	}

	static String generateSymbols(){
		char[] symbols = {'!', '@', '#', '$', '.', ',', '/', '?', ':', '\'', '"', '+', '-', '*', '~'};
		int wordsCount = (int) (Math.random() * 4);
		String res = "";
		while(wordsCount-- > 0){
			res += symbols[((int) (Math.random() * symbols.length))];
		}
		return res;
	}

	static String randomCase(String s){
		String res = "";
		for(char c : s.toCharArray()){
			res += (Math.random() > 0.4 ? (c + "").toUpperCase() : c);
		}
		return res;
	}

	static String getSaltString(int n) {
        String SALTCHARS = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < n) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

	static String reverse(String s){
		String res = s;
		for(int i=s.length()-1; i>=0; --i){
			res += s.charAt(i);
		}
		return res;
	}

}
