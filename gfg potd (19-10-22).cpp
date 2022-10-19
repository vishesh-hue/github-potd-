bool dfs(vector<int>adjList[],int node,vector<int>vis,int count){
        
        // base case
        if(count==(vis.size()-1))
            return true;
            
        // mark visited true
        vis[node]=1;
        
       // increase count
        count+=1;
        for(auto i:adjList[node])
        {
            if(!vis[i])
            {
                if(dfs(adjList,i,vis,count))
                  return true;
            }
            
        }
        return false;
    }
    bool check(int n,int m,vector<vector<int>> edges)
    {
       
       // adj list
        vector<int>adjList[n+1];
        for(auto i:edges){
            int x=i[0];
            int y=i[1];
            
            
            adjList[x].push_back(y);
            adjList[y].push_back(x);
        }
        int count=1;
        
        // visited array 
        vector<int>vis(n+1,0);
        for(int i=1;i<=n;i++)
        {
            if(dfs(adjList,i,vis,count))
               return true;
        }
        return false;
