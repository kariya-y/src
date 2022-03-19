
import java.util.*;
import java.util.stream.LongStream;
import java.io.*;


public class Math079 {
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
		int N  = nextInt();
		long sum = LongStream.rangeClosed(0, N-1).sum();
		System.out.println(sum);
	}
}
