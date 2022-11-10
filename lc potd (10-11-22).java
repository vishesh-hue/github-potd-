class Solution {
    public String removeDuplicates(String s) {
       StringBuilder sb=new StringBuilder() ;
       for(char c:s.toCharArray()){
           int size=sb.length();
           if(size>0 && sb.charAt(size-1)==c){
               sb.deleteCharAt(size-1);
           }
           else{
               sb.append(c);
           }
       }
      return sb.toString();  
    }
}
