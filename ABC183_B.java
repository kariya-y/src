
import java.util.*;
import java.io.*;
import java.awt.geom.Line2D;

public class ABC183_B {
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
		double sX = nextLong();
		double sY = nextLong();
		double gX = nextLong();
		double gY = nextLong();

		double ans = (sX*gY+gX*sY) / (sY+gY);
		System.out.println(ans);

	}
}
