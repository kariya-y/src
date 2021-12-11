import java.util.Scanner;

public class B212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int numArray[] = new int[4];
		numArray[0] = num / 1000;
		numArray[1] = num % 1000 / 100;
		numArray[2] = num % 100 / 10;
		numArray[3] = num % 10;

		boolean sameFlg = true;
		boolean plusFlg = true;
		for (int i = 0; i < 3; i++) {
			if (sameFlg) {
				sameFlg = numArray[i] == numArray[i + 1] ? true : false;
			}
			if (plusFlg) {
				plusFlg = (numArray[i]+1) % 10 == numArray[i + 1] % 10 ? true : false;
			}
		}
		if (sameFlg || plusFlg) {
			System.out.println("Weak");
			return;
		}
		System.out.println("Strong");
	}
}
