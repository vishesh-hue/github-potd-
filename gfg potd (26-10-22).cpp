class Solution{
public:
    int findMin(int n, char a[]){
        int red= 0, blue =0 , green= 0;
        for(int i=0 ; i<n ; i++){
            if(a[i]=='R')
            red++;
            else if(a[i]=='G')
            green++;
            else
            blue++;
        }
        if( (red==0 && blue==0) || (blue==0 && green==0) || (red==0 && green==0))
        return n;
        if((red%2==0  && blue%2==0  && green%2==0)  || (red%2!=0 && blue%2!=0 && green%2!=0))
        return 2;
        
        
        else 
        return 1;
        
    }
};
