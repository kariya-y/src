
import java.util.*;
import java.io.*;


public class ABC273_A {
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
		int a = sc.nextInt();
		long ans = a;
		if(a == 0) {
			System.out.println(1);
			sc.close();
			return;
		}
		for(int i = a-1; 0 < i ; i--) {
			ans *= i;
		}
		System.out.println(ans);
		sc.close();

	}
}
