import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class P_B013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int N = sc.nextInt();

		LocalDateTime limit = LocalDateTime.of(2021, 7, 29, 8, 59, 0, 0);
		LocalDateTime trainLimit = limit.minusMinutes(b).minusMinutes(c);
		LocalDateTime train = LocalDateTime.now();

		for (int i = 0; i < N; i++) {
			int hour = sc.nextInt();
			int minute = sc.nextInt();
			LocalDateTime time = LocalDateTime.of(2021, 7, 29, hour, minute, 0, 0);
			if (trainLimit.isBefore(time)) {
				break;
			}
			train = time;
		}

		LocalDateTime result = train.minusMinutes(a);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(result.format(dtf));
	}

}
