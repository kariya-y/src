import java.util.Scanner;

public class Ten90_001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int L = sc.nextInt();
		final int K = sc.nextInt();

		int numArray[] = new int[N];
		for(int i = 0; i < numArray.length; i++) {
			numArray[i] = sc.nextInt();
			System.out.println(numArray[i]);
		}

		double score = numArray[1];
		for(int i = 0; i < K; i++) {
			double min =  Math.pow(10, 9);
			for(int j = i+1; j < N ;j++) {
				int left = numArray[i];
				int right = numArray[j];
				int tmp = right - left;
				if(min > tmp) {
					min = tmp;
				}
			}

			if(score < min) {
				score = min;
			}
		}

	}

}
