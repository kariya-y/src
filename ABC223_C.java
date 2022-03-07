import java.util.*;

public class ABC223_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static void main(String[] args) {
		int N = sc.nextInt();
		ArrayList<double[]> list = new ArrayList<>();
		ArrayList<int[]> abList = new ArrayList<>();
		double totalTime = 0;
		long totalDis = 0;
		for (int i = 0; i < N; i++) {
			int a = nextInt();
			int b = nextInt();
			int[] ab = { a, b };
			abList.add(ab);
			totalDis += a;
			totalTime += (double) a / b;
			double[] array = { totalTime, totalDis };
			list.add(array);
		}

		double halfTime = totalTime / 2;

		if(N == 1) {
			double[] array = list.get(0);
			System.out.println(array[1]/2);
			return;
		}

		int l = 0;
		int r = N;
		int index = 0;
		while (l < r) {
			int middle = (l + r) / 2;
			double[] middleArray = list.get(middle);

			if (halfTime == middleArray[0]) {
				index = middle;
				break;
			}

			double[] beforeArray = new double[2];
			try {
				beforeArray = list.get(middle - 1);
				if (beforeArray[0] < halfTime && halfTime < middleArray[0]) {
					index = middle - 1;
				}
			} catch (Exception e) {
				index = 0;
				break;
			}

			double[] afterArray = new double[2];
			try {
				afterArray = list.get(middle + 1);
				if (middleArray[0] < halfTime && halfTime < afterArray[0]) {
					index = middle;
					break;
				}
			} catch (Exception e) {
				if (halfTime <= middleArray[0]) {
					index = N;
					break;
				}
			}

			if (halfTime < middleArray[0]) {
				r = middle;
				continue;
			}

			if (halfTime > middleArray[0]) {
				l = middle;
				continue;
			}
		}

		double[] hitArray = list.get(index);
		if (index < N - 1) {
			double mod = halfTime - hitArray[0];
			int[] nextAb = abList.get(index + 1);
			System.out.println(hitArray[1] + mod * nextAb[1]);
			return;
		}
		System.out.println(hitArray[1]);

	}
}
