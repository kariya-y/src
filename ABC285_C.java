import java.util.*;

class ABC285_C {
	public static int nextInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong(Scanner sc) {
		return Long.parseLong(sc.next());
	}

	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	static int H;
	static int W;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		sc.close();
		char[] cArray = A.toCharArray();
		long ans = 0;
		for(int i = cArray.length -1  ; 0 <= i ; i--) {
			char c = cArray[i];
			int idx = 1;
			for(char charABC : ABCArray) {
				if(charABC == c) {
					break;
				}else {
					idx++;
				}
			}
			ans +=idx * (long)Math.pow(26, cArray.length - i - 1);
		}
		System.out.println(ans);

	}

}