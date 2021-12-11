import java.util.*;

public class ABC230_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long N = nextLong();
		long A = nextLong();
		long B = nextLong();
		long P = nextLong();
		long Q = nextLong();
		long R = nextLong();
		long S = nextLong();

		//　黒の場所を記憶
		HashSet<String> blackSet = new HashSet<>();
		long ope1Start = Math.max(1 - A, 1 - B);
		long ope1End = Math.min(N - A, N - B);
		for (long i = ope1Start; i <= ope1End; i++) {
			String xy = (A + i) + "," + (B + i);
			if (!blackSet.contains(xy)) {
				blackSet.add(xy);
			}
		}

		long ope2Start = Math.max(1 - A, B - N);
		long ope2End = Math.min(N - A, N - 1);
		for (long i = ope2Start; i <= ope2End; i++) {
			String xy = (A + i) + "," + (B - i);
			if (!blackSet.contains(xy)) {
				blackSet.add(xy);
			}
		}

		for (long i = P; i <= Q; i++) {
			for (long ii = R; ii <= S; ii++) {
				String str = i + "," + ii;
				if(blackSet.contains(str)) {
					System.out.print("#");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}

	}
}
