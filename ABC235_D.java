import java.io.PrintWriter;
import java.util.*;

public class ABC235_D {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static int cnt;
	static int a;
	static int x;
	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		a = nextInt();
		x = nextInt();

		int firstCnt = 0;
		int num = 1;
		while (num < 10) {
			num *= a;
			firstCnt++;
			if (num == x) {
				out.println(firstCnt);
				out.flush();
				return;
			}
		}

		int max = 1;
		int keta = String.valueOf(x).length();
		while((num*Math.pow(a, max) < Math.pow(10, keta))) {
			max++;
		}

		max++;
		int ans = Integer.MAX_VALUE;
		System.out.println(1 << max+2);
		for (int i = 0; i < 1 << (max+2); i++) {
			int secondCnt = solve(num,i,max+2);
			System.out.println();
			if(secondCnt < ans) {
				ans = secondCnt;
			}
		}



		if(ans == Integer.MAX_VALUE) {
			out.println(-1);
			out.flush();
			return;
		} else {
			out.println(ans+firstCnt);
			out.flush();
		}
	}

	public static int solve(int num,int patern, int max) {
		boolean flg = true;
		for(int i = 0; i <= max; i++) {
			if((1&patern>>i) == 1 && flg) {
				int keta = String.valueOf(num).length();
				double tmp = num / 10;
				int minus = (int)tmp;
				int last = num - minus*10;
				num = (int) tmp;
				num += Math.pow(10, keta-1)*last;
				flg = false;
				if(num == x) {
					return i+1;
				}
			} else {
				num *= a;
				flg = true;
				if(num == x) {
					return i+1;
				}
			}
		}
		return Integer.MAX_VALUE;
	}

}
