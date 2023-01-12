class Solution {
  int [] result;
  List<List<Integer>> adj;
  boolean[] visited;
//This function takes in the number of nodes in a tree, the edges that connect the nodes and the labels of the nodes
   public int[] countSubTrees(int n, int[][] edges, String labels) {
//Creating an adjacency list to store the edges
     adj = new ArrayList<>(n);
     result = new int[n];
    //initializing the adjacency list
    for(int i = 0; i < n; i++){
        adj.add(new ArrayList<>());
    }
    //populating the adjacency list with the edges
    for(int[] edge : edges){
        adj.get(edge[0]).add(edge[1]);
        adj.get(edge[1]).add(edge[0]);
    }
    //keep track of visited nodes
     visited = new boolean[n];
    //calling the dfs function to count the subtrees starting from the root node
    dfs(0,labels);
    return result;
}
//dfs function to traverse the tree and count the subtrees
int[] dfs(int node, String labels){
    visited[node] = true;
    int[] count = new int[26];
    //visiting all the neighbours of the current node
    for(int nbr : adj.get(node)){
        if(!visited[nbr]){
            int [] adjCount = dfs(nbr, labels);
            //updating the count array with the count of the subtrees of the neighbours
            for(int i = 0 ; i < 26; i++){
                count[i] += adjCount[i];
            }
        }
    }
    //incrementing the count of the current node label
    char ch = labels.charAt(node);
    count[ch-'a']++;
    //storing the count of the subtrees of the current node
    result[node] = count[ch-'a'];
    return count;
  }
}
