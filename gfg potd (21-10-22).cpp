class Solution {
  public:
    vector<int> reverseSpiral(int R, int C, vector<vector<int>>&a)  {
        // code here
        vector<int>ans;
        
        int SRow=0,SCol=0,ECol=C-1,ERow=R-1;
        
        while(SRow<=ERow &&SCol<=ECol)
        {
            // part 1 starting row
            for(int i=SCol;i<=ECol;i++)
            {
                ans.push_back(a[SRow][i]);
            }
            SRow++;
            
            // part 2 ending col
            for(int i=SRow;i<=ERow;i++)
            {
                ans.push_back(a[i][ECol]);
            }
            ECol--;
            
            // part 3 ending row
            if(SRow<=ERow)
            {
                for(int i=ECol;i>=SCol;i--)
               {
                ans.push_back(a[ERow][i]);
               }
            }
            ERow--;
            
            // part 4 starting col
            if(SCol<=ECol)
            {
                for(int i=ERow;i>=SRow;i--)
              {
                ans.push_back(a[i][SCol]);
              }
            }
            
            SCol++;
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
};
