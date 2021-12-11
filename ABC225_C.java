import java.util.*;

public class ABC225_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	public static void main(String[] args) {
		int N = nextInt();
		int M = nextInt();
		int before = -1;
		for (int i = 0; i < N; i++) {
			boolean isMod0 = false;
			int first = nextInt();

			if(first%7 == 0){
				isMod0 = true;
			}
			if (i != 0 && before + 7 != first) {
				System.out.println("No");
				return;
			}

			before = first;

			for (int ii = 1; ii < M; ii++) {
				int num = nextInt();
				if (first + ii != num) {
					System.out.println("No");
					return;
				}
				if(isMod0) {
					System.out.println("No");
					return;
				}

				if((first+ii)%7 == 0){
					isMod0 = true;
				}
			}
		}
		System.out.println("Yes");
	}
}
