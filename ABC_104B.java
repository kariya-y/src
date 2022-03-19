
import java.util.*;
import java.io.*;

public class ABC_104B {
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static void main(String[] args) {
		String str = sc.next();
		if (str.charAt(0) != ABCArray[0]) {
			System.out.println("WA");
			return;
		}

		int idx = str.indexOf('C');
		if (idx < 2 || idx == str.length() - 1) {
			System.out.println("WA");
			return;
		}

		char[] charArray = str.toCharArray();
		String abc = "abcdefghijklmnopqrstuvwxyz";

		for (int i = 0; i < str.length(); i++) {
			if(i == 0 || i == idx)continue;
			if(abc.indexOf(charArray[i]) == -1){
				System.out.println("WA");
				return;
			}
		}
		System.out.println("AC");
	}
}
