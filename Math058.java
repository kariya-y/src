
import java.util.*;
import java.io.*;


public class Math058 {
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
		int N = nextInt();
		int X = nextInt();
		int Y = nextInt();

		int sum = Math.abs(X) + Math.abs(Y);
		int nMod = N % 2;
		int sumMod = sum % 2;
		if(N < sum) {
			System.out.println("No");
			return;
		}

		if(nMod == sumMod) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
