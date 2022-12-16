class Solution{
public:
    int hopscotch(int n, int m, vector<vector<int>> mat, int ty, int i, int j)
    {
        // code here
         int ans =0;
         
         // y is odd
         int dx0o[] ={0,1,1,1,0,-1};
         int dy0o[] ={1,1,0,-1,-1,0};
         
        // y is even 
        int dx0e[] ={-1,-1,-1,0,1,0};
        int dy0e[] ={0,-1,1,-1,0,1};
        
        // unit 2 distance
        // y  even
        int dx1e[] = {-2,-2,-2,-1,-1,0,0,1,1,1,1,2}; 
        int dy1e[] = {-1,0,1,-2,2,-2,2,-2,-1,1,2,0};
        
        // y  odd
        int dx1o[] = { -1,-1,-2,-1,-1,0,0,1,1,2,2,2}; 
        int dy1o[] = { -2,-1,0,1,2,-2,2,-2,2,-1,0,1};
        
        
        if(ty==0)// one step
        {
            //odd
            if(j%2!=0)
            {
                   for(int k=0; k<6; k++)
                        {
                          int new_x = dx0o[k]+i;
                          int new_y = dy0o[k]+j;
                
                           if(new_x>=0 && new_x<n && new_y>=0 && new_y<m)
                             ans+= mat[new_x][new_y];
                        }
            }
            else
            {
                   for(int k=0; k<6; k++)
                        {
                          int new_x = dx0e[k]+i;
                          int new_y = dy0e[k]+j;
                
                           if(new_x>=0 && new_x<n && new_y>=0 && new_y<m)
                             ans+= mat[new_x][new_y];
                        }
            }
    
        }
        else
        {
             //odd
            if(j%2!=0)
            {
                   for(int k=0; k<12; k++)
                        {
                          int new_x = dx1o[k]+i;
                          int new_y = dy1o[k]+j;
                
                           if(new_x>=0 && new_x<n && new_y>=0 && new_y<m)
                             ans+= mat[new_x][new_y];
                        }
            }
            else
            {
                   for(int k=0; k<12; k++)
                        {
                          int new_x = dx1e[k]+i;
                          int new_y = dy1e[k]+j;
                
                           if(new_x>=0 && new_x<n && new_y>=0 && new_y<m)
                             ans+= mat[new_x][new_y];
                        }
            }
        }
        return ans;
    }
};
