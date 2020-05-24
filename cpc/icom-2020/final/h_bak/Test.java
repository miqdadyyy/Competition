import java.lang.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
		char[] orbs = {'Q', 'W', 'E'};
        int SUM_TEST_CASE = 3;
        System.out.println(SUM_TEST_CASE);
        for (int CASE = 1; CASE <= SUM_TEST_CASE; ++CASE) {
			int n = (int) (Math.random() * 10) + 5;
			System.out.println(n);
			generateHour(n);
			int m = (int) (Math.random() * 10) + 5;
			System.out.println(m);
			generateHour(m);
			
		}
    }

	static void generateHour(int n){
		String startHour = (int) (Math.random() * 10) + ":" + (int) (Math.random()*60);
		for(int i=0; i<n; ++i){
			int diff = diffTime(startHour, "23:00");
			int duration = (int) (Math.random() * (diff / (n - i))) + 1;
			String finishHour = addTime(startHour, duration);
			System.out.println(addZero(startHour) + "-" + addZero(finishHour));
			startHour = addTime(finishHour, (int)(Math.random() * 90));
		}
			
	}

	static int diffTime(String start, String finish){
		int startHour = Integer.parseInt(start.split(":")[0]);
		int startMinute = Integer.parseInt(start.split(":")[1]);
		int finishHour = Integer.parseInt(finish.split(":")[0]);
		int finishMinute = Integer.parseInt(finish.split(":")[1]);

		int diffHour = finishHour - startHour;
		int res = 0;
		if(finishMinute < startMinute){
			res += finishMinute + 60 - startMinute;
			diffHour--;
			res += diffHour * 60;
		} else {
			res += finishMinute - startMinute;
			res += diffHour * 60;
		}
		return res;
	}

	static String addTime(String time, int duration){
		int hour = Integer.parseInt(time.split(":")[0]);
		int minute = Integer.parseInt(time.split(":")[1]);
		minute += duration;
		hour += minute / 60;
		minute %= 60;
		return hour + ":" + minute;
	}

	static String addZero(String time){
		int hour = Integer.parseInt(time.split(":")[0]);
		int minute = Integer.parseInt(time.split(":")[1]);
		String res = "";
		if(hour < 10) res += "0" + hour;
		else res += hour;

		res += ":";

		if(minute < 10) res += "0" + minute;
		else res += minute;
		return res;
	}

}
