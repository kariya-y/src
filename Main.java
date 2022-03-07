import java.awt.Point;
import java.util.*;

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
		double A = nextInt(); // Aまで全員もらえる
		double B = nextInt(); // Bまで確率でもらえる
		double C = nextInt(); // C人に配られる
		double X = nextInt(); // いろはちゃん順位
		double ans = 0;
		if(X <= A) {
			ans = 1;
			System.out.println(ans);
			return;
		}

		if(X > B) {
			ans = 0;
			System.out.println(ans);
			return;
		}
		ans = C/(B-A);

		System.out.println(ans);
	}

}