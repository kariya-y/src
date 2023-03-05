
import java.util.*;
import java.io.*;

public class AGC029_A {
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
		String line = sc.next();
		char[] lineChars = line.toCharArray();

		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < lineChars.length; i++) {
			char c = lineChars[i];
			if(c=='B') {
				list.add(i+1);
			}
		}

		long ans  =0;
		int cntB = 0;
		while(list.size() != 0) {
			int idx = list.get(list.size()-1);
			ans += line.length() - idx - cntB;
			cntB++;
			list.remove(list.size()-1);
		}
		System.out.println(ans);

	}
}
