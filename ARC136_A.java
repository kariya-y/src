
import java.util.*;
import java.io.*;


public class ARC136_A {
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
		String str = sc.next();
		String BB = "BB";
		String A  = "A";
		if(str.indexOf(A) != -1) {
			str = str.replace(A, BB);
		}
		if(str.indexOf(BB) != -1) {
			str = str.replace(BB, A);
		}
		System.out.println(str);
	}
}
