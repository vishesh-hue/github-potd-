


class Solution {
  public:
    string BalancedString(int N) {
        // code here
        
        int count=N/26;
        int rem=N%26;
        
        string ans="";
        // for 26 character 
        while(count>0)
        {
            int i=0;
            while(i<26)
            {
                ans.push_back('a'+i);
                i++;
            }
            count--;
        }
        
        // remaining or less than 26
        // if rem is even 
        if(rem%2==0)
        {
            // first n/2
           for(int i=0;i<rem/2;i++)
              ans.push_back('a'+i);
              
           // second half
           for(int j=26-rem/2;j<26;j++)
              ans.push_back('a'+j);
        }
        // odd case
        else
        {
                  //for digit sum
                   int digit_sum=0;
                   int r=N;
                   while(r>0)
                     {
                         digit_sum+=r%10;
                          r/=10;
                      }
            
                 //if digit_sum is even
                 if(digit_sum%2==0)
                   {
                            // first half
                               for(int i=0;i<(rem+1)/2;i++)
                                   ans.push_back('a'+i);
               
                               // second half
                               for(int j=26-(rem-1)/2;j<26;j++)
                                  ans.push_back('a'+j);
                    }
                    //odd
                    else
                    {
                              // first half
                          for(int i=0;i<(rem-1)/2;i++)
                            ans.push_back('a'+i);
              
                          // second half
                          for(int j=26-(rem+1)/2;j<26;j++)
                            ans.push_back('a'+j);
                    }
        }
        return ans;
    }
};
