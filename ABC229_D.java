import java.util.*;

public class ABC229_D {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		String str = sc.next();
		int K = nextInt();

		int ans = 0;
		for(int i = 0; i < 1 << str.length() ;i++) {
			StringBuffer sb = new StringBuffer();
			sb.append(str);
			int addXCnt = 0;
			int longX = 0;
			for(int ii = 0; ii < str.length(); ii++){
				if(K <= addXCnt) {
					break;
				}
				char c = sb.charAt(ii);
				if(c == 'X') {
					longX++;
					if(ans <= longX) {
						ans = longX;
					}
					continue;
				}
				if((1&i>>ii) == 1) {
					sb.replace(ii, ii+1, "X");
					addXCnt++;
					longX++;
					if(ans <= longX) {
						ans = longX;
					}
				} else {
					longX = 0;
				}
			}
		}
		System.out.println(ans);
	}
}
