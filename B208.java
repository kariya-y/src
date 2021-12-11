import java.util.Scanner;

public class B208 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();

		int a1 = 1;
		int a2 = 2;
		int a3 = kaijou(3);
		int a4 = kaijou(4);
		int a5 = kaijou(5);
		int a6 = kaijou(6);
		int a7 = kaijou(7);
		int a8 = kaijou(8);
		int a9 = kaijou(9);
		int a10 = kaijou(10);
		int arrayInt[] = { a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 };

		int result = 0;
		for (int i = arrayInt.length - 1; 0 <= i; i--) {
			if (P / arrayInt[i] != 0) {
				int waru = P / arrayInt[i];
				if (waru < 100) {
					P -= arrayInt[i] * waru;
					result += waru;
				} else {
					P -= arrayInt[i] * 100;
					result += 100;
				}
			}
		}
		System.out.println(result);

	}

	public static int kaijou(int num) {
		int result = num;
		for (int i = num - 1; 0 < i; i--) {
			result = result * i;
		}
		return result;
	}

}
