import java.util.*;

public class ABC234_C {
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
		long k = nextLong();

		StringBuffer sb = new StringBuffer();
		while(1 <= k) {
			long mod = k %2;
			if(mod == 1) {
				sb.insert(0,"2");
			} else {
				sb.insert(0,"0");
			}
			k = k /2;
		}

		System.out.println(sb.toString());
	}
}
