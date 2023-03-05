
import java.util.*;
import java.io.*;

public class ABC250_B {
	public static int nextInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong(Scanner sc) {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int mod = i % 2;
			for (int ii = 0; ii < A; ii++) {
				for (int iii = 0; iii < B * N; iii++) {
					if (iii / B % 2 == 0 && mod == 0) {
						System.out.print('.');
					}
					if (iii / B % 2 == 1 && mod == 0) {
						System.out.print('#');
					}
					if (iii / B % 2 == 0 && mod == 1) {
						System.out.print('#');
					}
					if (iii / B % 2 == 1 && mod == 1) {
						System.out.print('.');
					}
				}
				System.out.println();
			}
		}
	}
}
