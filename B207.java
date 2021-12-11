import java.util.Scanner;

public class B207 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int X = sc.nextInt();
		int sumPrice = 0;
		for(int i = 1; i <= N; i++) {
			int price = sc.nextInt();
			if(i % 2 == 0) {
				sumPrice += price-1;
			} else {
				sumPrice +=price;
			}
		}

		if(X >= sumPrice) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
