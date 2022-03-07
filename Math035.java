
import java.util.*;
import java.io.*;

public class Math035 {
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
		int x1 = nextInt(), y1 = nextInt(), r1 = nextInt();
		int x2 = nextInt(), y2 = nextInt(), r2 = nextInt();

		double vecX = Math.abs(x1 - x2);
		double vecY = Math.abs(y1 - y2);

		double dis = Math.sqrt(vecX * vecX + vecY * vecY);

		int bigR = Math.max(r1, r2);
		int smallR = Math.min(r1, r2);

		if(dis < Math.abs(r1-r2)) {
			System.out.println(1);
		}

		if (dis == Math.abs(r1-r2)) {
			System.out.println(2);
			return;
		}

		if(Math.abs(r1-r2) < dis && dis < Math.abs(r1+r2)) {
			System.out.println(3);
			return;
		}

		if(Math.abs(r1+r2) == dis) {
			System.out.println(4);
			return;
		}

		if(Math.abs(r1+r2) < dis) {
			System.out.println(5);
			return;
		}

	}
}
