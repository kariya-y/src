
import java.util.*;
import java.io.*;

public class ABC100_B {

	public static int nextInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong(Scanner sc) {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = nextInt(sc);
		int N = nextInt(sc);
		if(N==100) {
			N++;
		}
		sc.close();
		switch (D) {
		case 0:
			System.out.println(N);
			return;
		case 1:
			System.out.println(N * 100);
			return;
		case 2:
			System.out.println(N * 10000);
		}
	}
}
