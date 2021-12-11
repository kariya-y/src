import java.util.*;

public class ABC229_B {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s1 = sc.next();
		String s2 = sc.next();

		int len = 0;
		if(s1.length() > s2.length()) len = s2.length();
				len = s1.length();

		for(int i = 0; i < len; i++) {
			int num1 = Integer.valueOf(s1.substring(s1.length()-i-1,s1.length()-i));
			int num2 = Integer.valueOf(s2.substring(s2.length()-i-1,s2.length()-i));
			int sum = num1+num2;
			if(10 <= sum) {
				System.out.println("Hard");
				return;
			}
		}
		System.out.println("Easy");
	}
}
