class Solution {
  public:
    vector<int> maximumValue(Node* node) {
        
        if (node == NULL)
        {
            return {};
        }
        
        vector<int> ans;
        
        queue<Node*> q;
        
        q.push(node);
        
        while (!q.empty())
        {
            int size = q.size();
            
            int max = INT_MIN;
            
            for (int i = 0; i < size; i++)
            {
                Node* temp = q.front();
                q.pop();
                
                if (temp->data > max)
                {
                    max = temp->data;
                }
                
                if (temp->left)
                {
                    q.push(temp->left);
                }
                
                if (temp->right)
                {
                    q.push(temp->right);
                }
            }
            
            ans.push_back(max);
        }
        
        
        return ans;
    }
};
