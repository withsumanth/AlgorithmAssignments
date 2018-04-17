package AlgoTest;

public class WeiQuickUnPathComp {
	
	static int id[];
	static int size[];
	
	public static void UF(int N) {
		id = new int[N];
		size = new int[N];
		for(int i=0;i<N;i++) {
			id[i] = i;
			size[i] = 1;
		}
	}
	
	public static int find(int p) {
		/*int root = p;
		while(root!=id[root]) {
			root = id[root];
		}
		while(p!=root) {
			int newp = id[p];
			id[p] = root;
			p = newp;
		}*/
		while(p!=id[p]) {
			id[p] = id[id[p]];
			p = id[p];
		}
		return p;
	}
	
	static boolean connected(int p, int q) {
		return find(p)==find(q);
	}
	
	static void union(int p, int q) {
		int pid = find(p);
		int qid = find(q);
		if(size[pid]<size[qid]) {
			size[qid]+= size[pid];
			id[pid] = qid;
		}else {
			id[qid] = pid;
			size[pid]+= size[qid];
		}
	}

	public static void main(String[] args) {
		UF(10);
		union(4,3);
		union(3,8);
		union(6,5);
		union(9,4);
		union(2,1);
		union(5,0);
		union(7,2);
		union(6,1);
		union(7,3);
		System.out.println("connected(9,1) :"+connected(9,1));
		//System.out.println("connected(5,4) :"+connected(5,4));
		/*System.out.println("connected(9,6) :"+connected(9,6));
		union(9,6);
		System.out.println("connected(9,6) :"+connected(9,6));
		union(9,6);
		System.out.println("connected(5,6) :"+connected(5,6));
		union(5,6);
		System.out.println("connected(5,6) :"+connected(5,6));
		union(5,6);
		System.out.println("connected(9,2) :"+connected(9,2));
		union(9,2);
		System.out.println("connected(9,2) :"+connected(9,2));
		union(9,2);*/
		for(int i = 0;i<id.length;i++) {
			System.out.print(id[i]);
		}
		
	}

}
