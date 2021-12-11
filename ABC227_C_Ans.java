import java.util.*;

public class ABC227_C_Ans {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		long N = nextLong();
		long ans = 0;
		for(int i = 1; i <= Math.pow(N, (double)1/3); i++) {
			double tmp = Math.pow(N/i, (double)1/2);
			for(int ii = i; ii <= tmp; ii++) {
				double tmp2 = N/(i*ii);
				ans+= Math.floor(N/(i*ii)-ii+1);
//				for(int iii = ii; iii <= tmp2 ;iii++) {
//					ans++;
//				}
			}
		}
		System.out.println(ans);
	}
}
