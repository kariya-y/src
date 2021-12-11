import java.util.*;

public class Paiza_B060 {
	static Scanner sc = new Scanner(System.in);

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static void main(String[] args) {

		// ダイスの準備
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("U", 4);
		map1.put("R", 2);
		map1.put("D", 3);
		map1.put("L", 5);

		HashMap<String, Integer> map2 = new HashMap<>();
		map2.put("U", 6);
		map2.put("R", 3);
		map2.put("D", 1);
		map2.put("L", 4);

		HashMap<String, Integer> map3 = new HashMap<>();
		map3.put("U", 6);
		map3.put("R", 5);
		map3.put("D", 1);
		map3.put("L", 2);

		HashMap<String, Integer> map4 = new HashMap<>();
		map4.put("U", 6);
		map4.put("R", 2);
		map4.put("D", 1);
		map4.put("L", 5);

		HashMap<String, Integer> map5 = new HashMap<>();
		map5.put("U", 6);
		map5.put("R", 4);
		map5.put("D", 1);
		map5.put("L", 3);

		HashMap<String, Integer> map6 = new HashMap<>();
		map6.put("U", 2);
		map6.put("R", 4);
		map6.put("D", 5);
		map6.put("L", 3);

		ArrayList<HashMap> diceMap = new ArrayList<>();
		diceMap.add(map1);
		diceMap.add(map2);
		diceMap.add(map3);
		diceMap.add(map4);
		diceMap.add(map5);
		diceMap.add(map6);
		// ダイスの準備終了

		int N = nextInt();
		int H = nextInt();
		int W = nextInt();
		int x[] = new int[H];

		// 初期状態設定
		Arrays.fill(x, 0);
		int xy[][] = new int[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				xy[i][j] = 0;
			}
		}
		int startH = nextInt();
		int startW = nextInt();
		xy[startH - 1][startW - 1] = 6;
		int nowDice = 6;
		int position[] = { startH - 1, startW - 1 };
		// 初期状態設定終了

		String str = sc.next();
		for (int i = 0; i < N; i++) {
			String oneStr = str.substring(i, i + 1);
			HashMap<String,Integer> dice = diceMap.get(nowDice - 1);

			int nextDice = dice.get(oneStr);
			switch (oneStr) {
			case "U":
				position[0] = position[0]+1;
				xy[position[0]][position[1]] = nextDice;
				nowDice = nextDice;
				break;
			case "R":
				position[1] = position[1]+1;
				xy[position[0]][position[1]] = nextDice;
				nowDice = nextDice;
				break;
			case "D":
				position[0] = position[0]-1;
				xy[position[0]][position[1]] = nextDice;
				nowDice = nextDice;
				break;
			case "L":
				position[1] = position[1]-1;
				xy[position[0]][position[1]] = nextDice;
				nowDice = nextDice;
				break;
			}
		}


		// 答え出力
		for (int i = 0; i < H; i++) {
			if (i != 0) {
				System.out.println();
			}
			for (int j = 0; j < W; j++) {
				System.out.print(xy[i][j]);
			}
		}

	}
}
