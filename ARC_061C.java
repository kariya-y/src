import java.util.*;

public class ARC_061C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s = sc.next();

		long ans = 0;
		for (int i = 0; i < 1 << (s.length() - 1); i++) {
			long sum = 0;
			long tmp = 0;
			for (int j = 0; j < s.length(); j++) {
				int num = Character.getNumericValue(s.charAt(j));
				if (((i >> j) & 1) > 0) {
					sum += num + tmp * 10;
					tmp = 0;
				} else {
					tmp *= 10;
					tmp += num;
				}
			}
			ans += sum + tmp;
		}
		System.out.println(ans);
	}
}
