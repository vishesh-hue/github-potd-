class Solution {
    int median(int matrix[][], int R, int C) {
          int[]arr= new int[R*C];
          int idx= 0;
          for(int[]ar:matrix){
              for(int i:ar){
              arr[idx++]=i;
          
                  
              }
          }
          Arrays.sort(arr);
          return arr[(R*C+1)/2 -1];
    }
}
