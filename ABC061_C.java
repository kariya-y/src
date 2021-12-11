import java.util.*;

public class ABC061_C {
	static Scanner sc = new Scanner(System.in);
	static long ans = 0;

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = sc.next();

		int num = 0;
		for(int i = 0; i < 1 << (str.length() - 1) ;i++) {
			System.out.println(i);
			num++;
		}
		System.out.println(num);

	}

}
