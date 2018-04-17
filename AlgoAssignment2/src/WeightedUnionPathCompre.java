
public class WeightedUnionPathCompre {
	 int id[];
	 int size[];
	
	public void UF(int N) {
		id = new int[N];
		size = new int[N];
		for(int i=0;i<N;i++) {
			id[i] = i;
			size[i] = 1;
		}
	}
	
	public int find(int p) {
		while(p!=id[p]) {
			id[p] = id[id[p]];
			p = id[p];
		}
		return p;
	}
	
	public boolean connected(int p, int q) {
		return find(p)==find(q);
	}
	
	public void union(int p, int q) {
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
}
