import java.util.*;

public class ABC219_C_1 {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static void main(String[] args) {
		String newAbc = sc.next();
		newAbc = "0"+newAbc;
		ArrayList nameList = new ArrayList<>();
		final int N = nextInt();
		TreeMap<Long,String> map = new TreeMap();
		int maxLength = 0;
		for (int i = 0; i < N; i++) {
			final String name = sc.next();
			long key = 0;
			for(int j = 0; j < name.length(); j++) {
				String oneStr = name.substring(j,j+1);
				int num = newAbc.indexOf(oneStr);
				key *= 100;
				key += num;
			}
			map.put(key, name);
			if(maxLength < name.length()) {
				maxLength = name.length();
			}
		}
		TreeMap<Long,String> ansTree = new TreeMap();
		for(Long key : map.keySet()) {
			String name = map.get(key);
			int tmp = maxLength - name.length();
			if(tmp > 0) {
				int kakeru = (int)Math.pow(100, tmp);
				key *= kakeru;
			}
			ansTree.put(key, name);
		}
		for(Long key : ansTree.keySet()) {
			System.out.println(ansTree.get(key));
		}
	}
}
