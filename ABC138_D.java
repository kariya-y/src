import java.util.*;

public class ABC138_D {
	static Scanner sc = new Scanner(System.in);

	class Node {
		int idx;
		long count;
		List<Node> nodes = new ArrayList<>();

		Node(int index){
			this.idx = index;
			count = 0;
		}
	}

	public static int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public static long nextLong() {
		return Long.parseLong(sc.next());
	}

	static char[] abcArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	static char[] ABCArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	public static void main(String[] args) {
		new ABC138_D().solve();
	}

	public void solve() {
		int N = nextInt();
		int Q = nextInt();
		Node[] nodes = new Node[N + 1];

		for (int i = 0; i < N - 1; i++) {
			int a = nextInt();
			int b = nextInt();
			if (nodes[a] == null) {
				Node node = new Node(a);
				nodes[a] = node;
			}
			if (nodes[b] == null) {
				Node node = new Node(b);
				nodes[b] = node;
			}
			nodes[a].nodes.add(nodes[b]);
		}

		for (int i = 0; i < Q; i++) {
			int q = nextInt();
			int x = nextInt();
			serch(nodes,q,x);
		}

		for(int i = 1; i <= N ; i++) {
			System.out.println(nodes[i].count);
		}
	}

	public void serch(Node[] nodes, int q, int x) {
		nodes[q].count += x;
		for(int i = 0; i < nodes[q].nodes.size(); i++) {
			Node node = nodes[q].nodes.get(i);
			serch(nodes,node.idx,x);
		}
	}
}
