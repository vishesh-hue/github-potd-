class Solution{   
    public:
        int waysToBreakNumber(int N){
            long long int m = 1000000007; 
            return ((((N+1)%m)*((N+2)%m))/2)%m;
        }
};
