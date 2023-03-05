
import java.util.*;
import java.io.*;


public class ABC156_C {
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
		int N = nextInt(sc);
		int[] array = new int[N];
		for(int i = 0; i < N;i++) {
			array[i] = nextInt(sc);
		}

		int ans = Integer.MAX_VALUE;
		for(int i = 1; i <= 100 ; i++) {
			int sum = 0;
			for(int num : array) {
				sum += Math.pow(Math.abs(i-num), 2);
			}
			ans = Math.min(ans, sum);
		}
		System.out.println(ans);
		sc.close();

	}
}
