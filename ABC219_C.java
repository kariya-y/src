import java.util.*;

public class ABC219_C {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	static ArrayList<String> nameList;
	static String newAbc;

	public static void main(String[] args) {
		String abc = "abcdefghijklmnopqrstuvwxyz";

		newAbc = sc.next();
		ArrayList nameList = new ArrayList<>();
		final int N = nextInt();
		for (int i = 0; i < N; i++) {
			final String name = sc.next();
			nameList.add(name);
		}

		for(int i = 0; i < N; i++) {
			String delname = solve(nameList,0);
			int del = nameList.indexOf(delname);
			nameList.remove(del);
		}
	}

	public static String solve(ArrayList<String> nameList,int num) {

		ArrayList<String> samenameList = new ArrayList<>();
		TreeMap<Integer,String> map = new TreeMap();

		int sameNum = -1;
		for(int i = 0; i < nameList.size(); i++) {
			String name = nameList.get(i);
			String oneStr;
			try {
				oneStr  = name.substring(num,num+1);
			} catch(StringIndexOutOfBoundsException e){
				map.put(0,name);
				break;
			}
			int positionNum = newAbc.indexOf(oneStr);

			if(map.containsKey(positionNum)) {
				sameNum = positionNum;
				samenameList.add(name);
			} else {
				map.put(positionNum,name);
			}

		}
		if(sameNum != -1) {
			samenameList.add(map.get(sameNum));
		}

		boolean flg = true;
		int firstIndex = map.firstKey();
		String str = "";
		if(firstIndex == sameNum && samenameList.size() > 0) {
			str = solve(samenameList,num+1);
			flg = false;
		}
		if(flg) {
			System.out.println(map.get(map.firstKey()));
			return map.get(map.firstKey());
		}
		return str;
	}
}
