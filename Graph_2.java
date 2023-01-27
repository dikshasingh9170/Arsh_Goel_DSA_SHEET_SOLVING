import java.util.*;
class Graph_2 {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        boolean[] x=new boolean[V];
        dfs(0,adj,arr,x);
        return arr;
    }
    public static void dfs(int node,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> arr,boolean[] x){
        x[node]=true;
        arr.add(node);
        for(int i:adj.get(node)){
            if(x[i]==false){
                dfs(i,adj,arr,x);
            }
        }
    }
}