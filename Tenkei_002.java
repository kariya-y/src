import java.util.*;

public class Tenkei_002 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		TreeMap<Long, String> treeMap = new TreeMap<>();
		for (int i = 0; i < (1 << N); i++) {
			StringBuffer sb = new StringBuffer();
			StringBuffer numSb = new StringBuffer();
			long startCnt = 0;
			for (int ii = 0; ii < N; ii++) {
				if ((1 & i >> ii) == 1) {
					sb.append("(");
					numSb.append("0");
					startCnt++;
				} else {
					if (startCnt != 0) {
						sb.append(")");
						numSb.append("1");
						startCnt--;
					} else {
						break;
					}
				}
				if (sb.toString().length() == N && startCnt == 0) {
					Long num = Long.valueOf(numSb.toString());
					treeMap.put(num, sb.toString());
				}
			}
		}
		treeMap.forEach((a, b) -> System.out.println(b));
	}

}
