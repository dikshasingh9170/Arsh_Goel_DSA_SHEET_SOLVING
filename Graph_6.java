import java.util.*;
class Graph_6 {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
       boolean[] visited=new boolean[V+1];
       int x=-1;
       for(int i=0;i<V;i++){
            if(visited[i]==false){
                if(dfs(i,adj,visited,x)){
                    return true;
                }
            }
        }
       return false;
    }
    public boolean dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] visited,int parent){
        visited[node]=true;
        for(int i:adj.get(node)){
            if(visited[i]==true && i!=parent){
                return true;
            }
            if(visited[i]==false){
                if(dfs(i,adj,visited,node)){
                    return true;
                }
            }
        }
        return false;
    }
}