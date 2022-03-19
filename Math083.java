
import java.util.*;
import java.io.*;


public class Math083 {
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
		int[] students = new int[N];
		int[] schools = new int[N];
		for(int i = 0; i < N;i++) {
			students[i] = nextInt();
		}

		for(int i = 0; i < N;i++) {
			schools[i] = nextInt();
		}
		Arrays.sort(students);
		Arrays.sort(schools);
		long ans = 0;
		for(int i = 0; i < N;i++) {
			ans += Math.abs(students[i] - schools[i]);
		}
		System.out.println(ans);
	}
}
