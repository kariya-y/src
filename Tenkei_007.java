import java.util.*;

public class Tenkei_007 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = nextInt(sc);
		int classes[] = new int[N];
		for (int i = 0; i < N; i++) {
			classes[i] = nextInt(sc);
		}
		Arrays.sort(classes);

				int Q = nextInt(sc);
		int students[] = new int[Q];
		for (int i = 0; i < Q; i++) {
			students[i] = nextInt(sc);
		}

		for (int i = 0; i < Q; i++) {
			int student = students[i];

			long min = Long.MAX_VALUE;
			int l = 0;
			int r = N;
			int middle = (l+r) / 2;
			while(l < r) {
				int classRate = classes[middle];
				long abs = Math.abs(classRate-student);
				if(abs < min) {
					min = abs;
				}
				if(classRate < student) {
					l = middle+1;
					middle = (r+l)/2;
					continue;
				}
				if(classRate >= student) {
					r = middle;
					middle = (r+l)/2;
					continue;
				}

			}
			System.out.println(min);
		}
	}

	public static int nextInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}
}
