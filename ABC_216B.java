import java.util.*;

public class ABC_216B {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = sc.nextInt();
		String tmp = sc.nextLine();
		ArrayList<String> nameList = new ArrayList();
		for(int i = 0; i < num; i++) {
			String name = sc.nextLine();
			if(nameList.contains(name)) {
				System.out.println("Yes");
				return;
			}
			nameList.add(name);
		}
		System.out.println("No");

	}
}
