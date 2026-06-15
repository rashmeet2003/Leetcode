public class Solution {
    class Tuple{
        int stop,node,dist;
        Tuple(int stop, int node, int dist){
            this.stop = stop;
            this.node=node;
            this.dist=dist;
        }
    }
    class Pair{
        int to;
        int cost;
        Pair(int to, int cost){
            this.to = to;
            this.cost = cost;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
       ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
       for(int i=0; i<n; i++){
        adj.add(new ArrayList<>());
       }
       for(int i=0; i<flights.length; i++){
        int from = flights[i][0];
        int to = flights[i][1];
        int cost = flights[i][2];

        adj.get(from).add(new Pair(to,cost));
       }
       int dist[] = new int[n];
       Arrays.fill(dist,Integer.MAX_VALUE);
       dist[src] = 0;

       Queue<Tuple> q = new LinkedList<>();
       q.add(new Tuple(0,src,0));

       while(!q.isEmpty()){
        Tuple curr = q.poll();
        int currStop = curr.stop;
        int currDist = curr.dist;
        int currNode = curr.node;

        for(int i=0; i<adj.get(currNode).size(); i++){
            int neigh = adj.get(currNode).get(i).to;
            int distN = adj.get(currNode).get(i).cost;
            
            if(dist[neigh] > currDist + distN && k>=currStop){
                dist[neigh] = currDist + distN;
                q.add(new Tuple(currStop+1,neigh,dist[neigh]));
            }
        }
       }
       if(dist[dst] == Integer.MAX_VALUE) return -1;
       return dist[dst];
    }
}