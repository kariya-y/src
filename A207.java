import java.util.Scanner;

public class A207 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		for(int i = a; i <= b; i++) {
			result++;
		}
		System.out.println(result);
	}

}
