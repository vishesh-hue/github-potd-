class node{
    int[] freq;
    node[] next;
    node(){
        freq= new int[26];
        next=new node[26];
    }
}
class Solution{
    static List<Integer> prefixCount(int N, int Q, String li[], String query[])
    {
         List<Integer> ans=new ArrayList<>();
         node head=new node();
         for(String s:li){
             node curr=head;
             for(char c:s.toCharArray()){
                 curr.freq[c-'a']++;
                 if(curr.next[c-'a']==null)curr.next[c-'a']=new node();
                 curr=curr.next[c-'a'];
                 
             }
         }
         for(String s:query){
             node curr=head;
             for(int i=0;i<s.length();i++){
                 char c=s.charAt(i);
                 if(i==s.length()-1){
                     ans.add(curr.freq[c-'a']);
                     break;
                     
                 }
                 if(curr.next[c-'a']==null){
                     ans.add(0);
                     break;
                 }
                 curr=curr.next[c-'a'];
                 
             }
         }
         return ans;
    }
}
