import java.util.Scanner;
import java.util.regex.Pattern;

public class B196 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numStr = sc.nextLine();
		String strArray[] = numStr.split("\\.");
		System.out.println(strArray[0]);
	}

}
