import java.util.*;

public class ABC079_C {
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
		String str = sc.next();

		for (int patern = 0; patern < 1 << 3; patern++) {
			StringBuilder sb = new StringBuilder();
			int sum = Integer.parseInt(str.substring(0, 1));
			sb.append(sum);
			for (int i = 0; i < 3; i++) {
				System.out.print(((patern >> i) & 1));
				if (((patern >> i) & 1) == 1) {
					sum += Integer.parseInt(str.substring(i + 1, i + 2));
					sb.append("+" + str.substring(i + 1, i + 2));
				} else {
					sum -= Integer.parseInt(str.substring(i + 1, i + 2));
					sb.append("-" + str.substring(i + 1, i + 2));
				}
			}
			System.out.println();
			if (sum == 7) {
				System.out.println(sb.toString() + "=7");
				return;
			}
		}
	}
}
