import java.util.*;

public class ABC205_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long A = nextInt();
		long B = nextInt();
		long C = nextInt();

		boolean isEven = false;
		if (C % 2 == 0) {
			isEven = true;
		}

		if(isEven) {
			if(Math.abs(A) == Math.abs(B)) {
				System.out.println("=");
				return;
			}
			if(Math.abs(A) < Math.abs(B)) {
				System.out.println("<");
				return;
			} else {
				System.out.println(">");
				return;
			}
		}

		if(A == B) {
			System.out.println("=");
			return;
		}
		if(A < B) {
			System.out.println("<");
			return;
		} else {
			System.out.println(">");
			return;
		}
	}
}