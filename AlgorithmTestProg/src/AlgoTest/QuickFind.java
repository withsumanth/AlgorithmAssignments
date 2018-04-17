package AlgoTest;

public class QuickFind {
	
	static int[] id;
	public static void UF(int N) {
		id = new int[N];
		for(int i=0;i<N;i++) {
			id[i] = i;
		}
	}
	
	public static int find(int p) {
		return id[p];
	}
	
	public static boolean connected(int p, int q) {
		return find(p)==find(q);
	}
	
	public static void union(int p , int q) {
		int pid = id[p];
		int qid = id[q];
		for(int i=0;i<id.length;i++) {
			if(id[i]==pid) {
				id[i] = qid;
			}
		}
	}

	public static void main(String[] args) {
		UF(10);
		union(4,3);
		union(3,8);
		union(6,5);
		union(9,4);
		union(2,1);
		System.out.println("connected(8,9): "+connected(8,9));
		System.out.println("connected(5,0): "+connected(5,0));
		union(5,0);
		union(7,2);
		union(6,1);
		System.out.println("connected(2,7): "+connected(2,7));
		for(int i = 0;i<id.length;i++) {
			System.out.print(id[i]);
		}
	}

}
