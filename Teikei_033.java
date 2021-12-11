import java.util.*;

public class Teikei_033 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int H = sc.nextInt();
		final int W = sc.nextInt();

		if(H==1 || W == 1) {
			System.out.println(H*W);
		} else {
			System.out.println((H/2+H%2)*(W/2+W%2));
		}
	}

}
