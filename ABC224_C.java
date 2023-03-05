
import java.util.*;
import java.awt.Point;
import java.io.*;

public class ABC224_C {

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<double[]> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			double[] array = new double[2];
			array[0] = sc.nextInt();
			array[1] = sc.nextInt();
			list.add(array);
		}

		int ans = 0;
		for (int i = 0; i < N; i++) {
			for (int ii = i + 1; ii < N; ii++) {
				for (int iii = ii + 1; iii < N; iii++) {
					double[] point1 = list.get(i);
					double[] point2 = list.get(ii);
					double[] point3 = list.get(iii);
/*
					double a = Math.sqrt(Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2));
					double b = Math.sqrt(Math.pow(point1[0] - point3[0], 2) + Math.pow(point1[1] - point3[1], 2));
					double c = Math.sqrt(Math.pow(point2[0] - point3[0], 2) + Math.pow(point2[1] - point3[1], 2));
*/


					double a = Math.sqrt(((point1[0] - point2[0]) * (point1[0] - point2[0]))
							+ ((point1[1] - point2[1]) * (point1[1] - point2[1])));
					double b = Math.sqrt(((point1[0] - point3[0]) * (point1[0] - point3[0]))
							+ ((point1[1] - point3[1]) * (point1[1] - point3[1])));
					double c = Math.sqrt(((point2[0] - point3[0]) * (point2[0] - point3[0]))
							+ ((point2[1] - point3[1]) * (point2[1] - point3[1])));

					if (a + b > c && a + c > b && b + c > a) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
		sc.close();

	}
}
