import java.util.Scanner;

public class B200 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();
		int count = sc.nextInt();

		for(int i = 0; i < count; i++) {
			if(num % 200 == 0) {
				num /= 200;
			} else {
				num = num * 1000 + 200;
			}
		}
		System.out.println(num);
	}
}
