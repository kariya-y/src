
import java.util.*;
import java.io.*;


public class Math036 {
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
		int A = nextInt(), B = nextInt();
		int H = nextInt()*5, M = nextInt();

		// 時間の角度を算出
		double absT = Math.abs(H-M);
		double angle = absT / 60 * 360;
		// 180度以上の場合は、逆側の角度をみる。
		if(180 < angle) {
			angle = 360 - angle;
		}

		System.out.println(angle);
		double ans = 0;
		if(angle == 90) {
			ans = Math.sqrt(A*A+B*B);
		} else {
			// 外積を求める

		}



	}
}
