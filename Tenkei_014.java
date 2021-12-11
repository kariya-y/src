import java.util.*;

public class Tenkei_014 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = nextInt(sc);
		int houses[] = new int[N];
		for (int i = 0; i < N; i++) {
			houses[i] = nextInt(sc);
		}
		int schools[] = new int[N];
		for (int i = 0; i < N; i++) {
			schools[i] = nextInt(sc);
		}

		Arrays.sort(houses);
		Arrays.sort(schools);

		long result = 0;
		for (int i = 0; i < N; i++) {
			result += Math.abs(houses[i]-schools[i]);
		}
		System.out.println(result);
	}

	public static int nextInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}
}
