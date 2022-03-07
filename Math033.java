
import java.util.*;
import java.awt.Point;
import java.io.*;

public class Math033 {
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
		Point a = new Point(nextInt(), nextInt());
		Point b = new Point(nextInt(), nextInt());
		Point c = new Point(nextInt(), nextInt());

		// パターン1
		// ba bcの内積
		Point ba = new Point(a.x - b.x, a.y - b.y);
		Point bc = new Point(c.x - b.x, c.y - b.y);
		int naiseki = ba.x*bc.x+ba.y*bc.y;
		double ans = -1;
		if(naiseki < 0) {
			Point p = new Point(Math.abs(a.x-b.x),Math.abs(a.y-b.y));
			ans = p.x*p.x+p.y*p.y;
			ans = Math.sqrt(ans);
			System.out.println(ans);
			return;
		}

		// パターン3
		// ca cbの内積
		Point ca = new Point(a.x-c.x,a.y-c.y);
		Point cb = new Point(b.x-c.x,b.y-c.y);
		naiseki = ca.x*cb.x+ca.y*cb.y;
		if(naiseki < 0) {
			Point p = new Point(Math.abs(a.x-c.x),Math.abs(a.y-c.y));
			ans = p.x*p.x+p.y*p.y;
			ans = Math.sqrt(ans);
			System.out.println(ans);
			return;
		}

		// 辺の長さ
		double edge = (bc.x)*(bc.x)+(bc.y)*(bc.y);
		edge = Math.sqrt(edge);
		// ba bcの外積を求める
		double gaiseki = Math.abs(ba.x*bc.y-ba.y*bc.x);
		ans = gaiseki / edge;
		System.out.println(ans);

	}
}
