import java.io.*;
import java.util.*;

public class ABC228_D_Ans {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long N = (long) Math.pow(2, 20);
		long[] a = new long[(int) N];
		int[] p = new int[(int) N];
		Arrays.fill(a, -1);
		for (int i = 0; i < N; i++) {
			p[i] = i;
		}

		int q = Integer.parseInt(st.nextToken());
		while (q-- > 0) {
			st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			long x = Long.parseLong(st.nextToken());
			if (t == 2) {
				System.out.println(a[(int) (x % N)]);
			} else {
				int m = (int)(x%N);
				int tmp = find(m,p);
				a[tmp] = x;
				p[tmp] = find((int)((tmp + 1) % N),p);
			}
		}
	}

	public int find(int y,int[] p) {
		if(p[y] != y) {
			p[y] = find(p[y], p);
		}
		return p[y];
	}

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
        new ABC228_D_Ans().run();
	}
}
