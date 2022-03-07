package algorithm;
import java.util.*;


public class Prime {
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
		System.out.println(isPrime(200));
	}

	public static boolean isPrime(long N) {
		for(long i = 2; i*i <= N;i++) {
			if(N % i == 0) {
				return false;
			}
		}
		return true;
	}
}
