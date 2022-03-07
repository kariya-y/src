import java.io.PrintWriter;
import java.util.*;

public class Math014 {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		long N = nextLong();

		boolean flg = false;
		for(long i = 2; i*i <= N; i++) {
			while(N % i == 0) {
				if(flg) {
					out.print(" ");
				}
				out.print(i);
				N /= i;
				flg = true;
			}
		}

		if(N >= 2) {
			if(flg) {
				out.print(" ");
			}
			out.println(N);
		}

		out.flush();
	}

}
