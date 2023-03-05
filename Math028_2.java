
import java.util.*;
import java.io.*;

public class Math028_2 {

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] dp = new int[N];
		int[] array = new int[N];
		for(int i = 0; i < N;i++) {
			array[i] = sc.nextInt();
		}
		dp[0] = 0;
		dp[1] = Math.abs(array[0] - array[1]);
		for(int i =2; i < N ;i++) {
			int num  = array[i];
			dp[i] = Math.min(Math.abs(array[i-2]-num)+dp[i-2], Math.abs(array[i-1]-num)+dp[i-1]);
		}
		System.out.println(dp[N-1]);
	}
}
