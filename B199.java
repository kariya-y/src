import java.util.Scanner;

public class B199 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int leftArray[] = new int[count];
		int rightArray[] = new int[count];

		for(int i = 0; i < count * 2; i++) {
			if(i < count) {
				leftArray[i] = sc.nextInt();
			} else {
				rightArray[i-count] = sc.nextInt();
			}
		}
		int min = 0;
		int max = 1000;
		for(int i = 0; i < count; i++) {
			if(min < leftArray[i]) {
				min = leftArray[i];
			}
			if(max > rightArray[i]) {
				max = rightArray[i];
			}
		}
		if(max - min <= 0) {
			System.out.println(0);
		} else {
			System.out.println(max - min + 1);
		}
	}
}
