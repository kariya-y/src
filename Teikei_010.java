import java.io.PrintWriter;
import java.util.*;
import java.util.Scanner;

public class Teikei_010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		final int N = Integer.parseInt(sc.next());

		int[] scoreA = new int[N];
		Arrays.fill(scoreA, 0);
		int[] scoreB = new int[N];
		Arrays.fill(scoreB, 0);

		for (int i = 0; i < N; i++) {
			int classNum = Integer.parseInt(sc.next());
			int point = Integer.parseInt(sc.next());
			if (i != 0) {
				scoreA[i] = scoreA[i - 1];
				scoreB[i] = scoreB[i - 1];
			}
			if (classNum == 1) {
				if (i == 0) {
					scoreA[0] = point;
				} else {
					scoreA[i] += point;
				}
			} else {
				if (i == 0) {
					scoreB[0] = point;
				} else {
					scoreB[i] += point;
				}
			}
		}

		final int Q = Integer.parseInt(sc.next());
		for (int i = 0; i < Q; i++) {
			int l = Integer.parseInt(sc.next());
			int r = Integer.parseInt(sc.next());
			int sumA = 0;
			int sumB = 0;
			if (l - 1 > 0) {
				sumA = scoreA[r - 1] - scoreA[l - 2];
				sumB = scoreB[r - 1] - scoreB[l - 2];
			} else {
				sumA = scoreA[r - 1];
				sumB = scoreB[r - 1];
			}
			out.print(sumA + " " + sumB);
			if (i != Q - 1) {
				out.println();
			}
		}
		out.flush();

	}

}
