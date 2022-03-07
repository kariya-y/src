
import java.util.*;
import java.io.*;


public class ABC239_D {
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
		int a = nextInt();
		int b = nextInt();
		int c = nextInt();
		int d = nextInt();

		boolean isSente = false;
		for(int i = a; i <= b;i++) {
			boolean thisSente = true;
			for(int ii = c; ii <= d;ii++) {
				boolean isPrime = isPrime(i+ii);
				if(isPrime) {
					thisSente = false;
				}
			}
			if(thisSente) {
				isSente = true;
			}
		}

		if(isSente) {
			System.out.println("Takahashi");
		} else {
			System.out.println("Aoki");
		}
	}

	static boolean isPrime(long num) {
		for(long i = 2; i * i <= num; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
}
