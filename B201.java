import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class B201 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String linekuran = sc.nextLine();
		List<Integer> numList = new ArrayList();
		List<String> strList = new ArrayList();
		for(int i = 0; i < count; i++){
			strList.add(sc.next());
			numList.add(sc.nextInt());
		}
		int max = Collections.max(numList);
		int maxIndex = numList.indexOf(max);
		numList.remove(maxIndex);
		strList.remove(maxIndex);
		System.out.println(strList.get(numList.indexOf(Collections.max(numList))));
	}
}
