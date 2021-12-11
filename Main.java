import java.io.*;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		char[] oxx = { 'o', 'x', 'x' };
		String str = sc.next();

		if(str.length() == 1) {
			System.out.println("Yes");
			return;
		}

		String first = str.substring(0, 2);

		int start = -1;
		if (first.equals("ox")) {
			start = 0;
		}
		if (first.equals("xx")) {
			start = 1;
		}
		if (first.equals("xo")) {
			start = 2;
		}

		if (start == -1) {
			System.out.println("No");
			return;
		}

		int idx = start;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(2 < idx) {
				idx -=3;
			}
			char ox = oxx[idx];
			idx++;
			if(ch != ox) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
