import java.util.*;
class Graph_1 {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs=new ArrayList<Integer>();
        boolean[] x=new boolean[V];
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(0);
        x[0]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            bfs.add(node);
            for(int i:adj.get(node)){
                if(x[i]==false){
                    x[i]=true;
                    q.add(i);
                }
            }
        }
        return bfs;
    }
}
