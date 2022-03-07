import java.io.PrintWriter;
import java.util.*;

public class ABC237_C {
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
		int firstCnt = countFirst(str);
		int lastCnt = countLast(str);
		if(firstCnt == str.length()) {
			System.out.println("Yes");
			return;
		}

		int sa = lastCnt - firstCnt;
		if (sa < 0) {
			System.out.println("No");
			return;
		}

		StringBuilder sb = new StringBuilder(str);
		sb.delete(sb.length() - lastCnt, str.length());
		sb.delete(0, firstCnt);

		StringBuilder sbR = new StringBuilder(sb);
		String strReverse = sbR.reverse().toString();
		if (sb.toString().equals(strReverse)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	static int countLast(String str) {
		int cnt = 0;
		for (int i = str.length() - 1; 0 < i; i--) {
			if (str.charAt(i) == 'a') {
				cnt++;
			} else {
				break;
			}
		}
		return cnt;
	}

	static int countFirst(String str) {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				cnt++;
			} else {
				break;
			}
		}
		return cnt;
	}
}
