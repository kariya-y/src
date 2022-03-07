package algorithm;

import java.util.*;

public class allBit {
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
		int N = 8;
		allBitm(N);
	}

	public static void allBitm(int N) {
		for (int p = 0; p < 1 << N; p++) {
			for (int i = 0; i < N; i++) {
				if ((p >> i & 1) == 1) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
}
