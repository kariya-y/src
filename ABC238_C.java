
import java.util.*;
import java.io.*;


public class ABC238_C {
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
		long N = nextLong();
		long mod = 998244353;
		long x = 0;
		long p = 10,q = 1;

		for(int i = 0; i < String.valueOf(N).length(); i++) {
			long m = Math.min(N, p-1)-q+1;
			m%=mod;
			long tmp = (m*((m+1)/2));
			x += (m*((m+1)/2));
			x %= mod;
			p *= 10;
			q *= 10;
		}
/*
		while(true) {
			long m = Math.min(N, p-1)-q+1;
			System.out.println(m);
			m%=mod;
			long tmp = (m*((m+1)/2));
			System.out.println(tmp);
			x += (m*((m+1)/2));
			x %= mod;
			System.out.println(x);
			if(p>N) break;
			p *= 10;
			q *= 10;
		}
*/
		System.out.println(x);
	}
}
