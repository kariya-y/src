import java.util.Scanner;

class Main {
	public static int nextInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong(Scanner sc) {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	public static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
	}
}