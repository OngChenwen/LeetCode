package Algorithm.Util;

import java.util.*;

public class TopologicalSort {
    public static void main(String[] args) {
//        int[][] matrix = new int[][]{{1,0},{2,0},{3,1},{3,2}};
        int[][] matrix = new int[][]{{1,0}};
        System.out.println(helper(matrix,2));
    }

    static List<Integer> helper(int[][] graph, int numOfNodes){
        List<Integer> ans = new ArrayList<>();
        int n = graph.length;
        int[] inDegree = new int[numOfNodes];
        Map<Integer,List<Integer>> adjList = new HashMap<>();

        for (int[] ints : graph) {
            int from = ints[1];
            int to = ints[0];
            // 不存在就记得初始化，否则下一行报错
            if(!adjList.containsKey(from)) adjList.put(from,new ArrayList<>());
            adjList.get(from).add(to);
            inDegree[to]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++){
            if(inDegree[i] == 0) {
                q.offer(i);
                ans.add(i);
            }
        }

        while(!q.isEmpty()){
            int cur = q.poll();
            // 不存在就跳过，否则下一行报错
            if(!adjList.containsKey(cur)) continue;
            for(int next : adjList.get(cur)){
                inDegree[next]--;
                if(inDegree[next] == 0) {
                    q.offer(next);
                    ans.add(next);
                }

            }
        }

        for(int num : inDegree){
            if (num != 0) return new ArrayList<>();
        }

        return ans;
    }
}
