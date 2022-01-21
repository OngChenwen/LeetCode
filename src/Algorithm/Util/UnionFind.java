package Algorithm.Util;

public class UnionFind {
    private int count;
    private int[] parent;
    public UnionFind(int n){
        count = n;
        parent = new int[n];
        // initial parent array -> parent[x] = x, self as root
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public int find(int x){
        while(x != parent[x]){
            parent[x] = parent[parent[x]];
            x = parent[x];
        }

        return x;
    }

    public void union(int x, int y){
        int rootX = find(x);
        int rootY = find(y);

        if (rootX == rootY) return;

        parent[rootX] = rootY;
        count--;
    }

    public boolean isConnected(int x, int y){
        return find(x) == find(y);
    }

    public int count(){
        return count;
    }
}
