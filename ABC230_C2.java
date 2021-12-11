import java.util.*;

public class ABC230_C2 {
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

		long ope1Start = Math.max(1 - A, 1 - B);
		long ope1End = Math.min(N - A, N - B);
		long[] ope1StartArray = { A + ope1Start, B + ope1Start };
		long[] ope1EndArray = { A + ope1End, B + ope1End };

		long ope2Start = Math.max(1 - A, B - N);
		long ope2End = Math.min(N - A, B - 1);
		long[] ope2StartArray = { A + ope2Start, B - ope2Start };
		long[] ope2EndArray = { A + ope2End, B - ope2End };

		for (long i = P; i <= Q; i++) {
			for (long ii = R; ii <= S; ii++) {
				long[] target = { i, ii };
				if (ope1StartArray[0] <= target[0] && ope1StartArray[1] <= target[1] &&
						target[0] <= ope1EndArray[0] && target[1] <= ope1EndArray[1]) {
					if (Math.abs(target[0] - target[1]) == Math.abs(ope1Start - ope1End)) {
						System.out.print("#");
						continue;
					}
				}
				if (ope2StartArray[0] <= target[0] &&  target[1] <= ope2StartArray[1] &&
						target[0] <= ope2EndArray[0] && ope2EndArray[1] <= target[1]) {
					if (target[0] + target[1] == ope2Start + ope2End) {
						System.out.print("#");
						continue;
					}
				}
				System.out.print(".");

			}
			System.out.println();
		}

	}
}
