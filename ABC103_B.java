
import java.util.*;
import java.io.*;


public class ABC103_B {
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
		String S = sc.next();

		String T = sc.next();
		for(int i = 0; i < S.length();i++) {
			String str = T.substring(S.length()-i,S.length()) + T.substring(0,S.length()-i);;
			if(str.equals(S)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
