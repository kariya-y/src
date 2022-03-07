
import java.util.*;
import java.io.*;


public class Math034 {
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
		int N = nextInt();

		int[] xPoints = new int[N];
		int[] yPoints = new int[N];
		for(int i = 0 ; i < N;i++) {
			xPoints[i] = nextInt();
			yPoints[i] = nextInt();
		}

		double ans = Double.MAX_VALUE;
		for(int i = 0; i < N-1 ;i++) {
			double baseX = xPoints[i];
			double baseY = yPoints[i];
			for(int ii = i+1; ii < N; ii++) {
				double thisX = xPoints[ii];
				double thisY = yPoints[ii];
				double vecX = baseX - thisX;
				double vecY = baseY - thisY;

				double dis = Math.sqrt(vecX*vecX+vecY*vecY);
				if(dis < ans) {
					ans = dis;
				}
			}
		}
		out.println(ans);
		out.flush();
		sc.close();
	}
}
