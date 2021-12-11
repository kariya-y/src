import java.io.PrintWriter;
import java.util.Scanner;

public class Tenkei_004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int HEIGHT = sc.nextInt();
		int WIDTH = sc.nextInt();

		int numArray[][] = new int[HEIGHT][WIDTH];

		int sumRowArray[] = new int[HEIGHT];
		int sumColumnArray[] = new int[WIDTH];

		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				numArray[i][j] = Integer.parseInt(sc.next());
				;
				sumRowArray[i] += numArray[i][j];
				sumColumnArray[j] += numArray[i][j];
			}
		}

		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				out.print(sumColumnArray[j] + sumRowArray[i] - numArray[i][j]);
				if (j != WIDTH - 1) {
					out.print(" ");
				}
			}
			if (i != HEIGHT - 1) {
				out.println();
			}
		}
		out.flush();
	}
}
