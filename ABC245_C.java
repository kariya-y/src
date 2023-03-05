import java.awt.Point;
import java.util.*;
import java.util.Map.Entry;

class ABC245_C {

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
		int K = nextInt(sc);
		int[] Aarray = new int[N];
		int[] Barray = new int[N];

		for (int i = 0; i < N; i++) {
			Aarray[i] = nextInt(sc);
		}
		for (int i = 0; i < N; i++) {
			Barray[i] = nextInt(sc);
		}

		boolean[] isOk = new boolean[2];
		isOk[0] = true;
		isOk[1] = true;

		for(int i = 0; i < N-1;i++) {
			int baseA = Aarray[i];
			int baseB = Barray[i];
			int nextA = Aarray[i+1];
			int nextB = Barray[i+1];
			boolean[] thisOk = new boolean[2];

			if(isOk[0]) {
				int abs = Math.abs(baseA-nextA);
				if(abs <= K) {
					thisOk[0] = true;
				} else {
					thisOk[0] = false;
				}
				abs = Math.abs(baseA-nextB);
				if(abs <= K) {
					thisOk[1] = true;
				} else {
					thisOk[1] = false;
				}
			}

			if(isOk[1]) {
				int abs = Math.abs(baseB-nextA);
				if(abs <= K || thisOk[0]) {
					thisOk[0] = true;
				} else {
					thisOk[0] = false;
				}
				abs = Math.abs(baseB-nextB);
				if(abs <= K || thisOk[1]) {
					thisOk[1] = true;
				} else {
					thisOk[1] = false;
				}
			}

			isOk[0] = thisOk[0];
			isOk[1] = thisOk[1];

			if(!isOk[0] && !isOk[1]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}