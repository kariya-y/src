import java.awt.Point;
import java.util.*;
import java.util.Map.Entry;

class Main {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static void main(String[] args) {
		long a = nextLong();
		long b = nextLong();
		long c = nextLong();

		long f =  (c - a - b) * (c - a - b);
		double s = Math.pow(c-a-b, 2);
		System.out.println(f);
		System.out.println(s);
	}
}