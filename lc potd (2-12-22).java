class Solution {
    public boolean closeStrings(String word1, String word2) {
     if(word1.length()!=word2.length()) return false;
     Map<Character,Integer> word1Frequency=new HashMap<>();
     Map<Character,Integer> word2Frequency=new HashMap<>();
      // frequency of word1  
     for(char c:word1.toCharArray()){
       word1Frequency.put(c,word1Frequency.getOrDefault(c,0)+1);
     }
      // frequency of word 2  
     for(char c:word2.toCharArray()){
       word2Frequency.put(c,word2Frequency.getOrDefault(c,0)+1);
     }
      
     if(!word1Frequency.keySet().equals(word2Frequency.keySet())){
         return false;
     }
     // convert map values to arraylist
     List<Integer> word1FrequencyList=new ArrayList<>(word1Frequency.values()) ;
     List<Integer> word2FrequencyList=new ArrayList<>(word2Frequency.values()) ;
        
      Collections.sort(word1FrequencyList);
      Collections.sort(word2FrequencyList);
        
        return word1FrequencyList.equals(word2FrequencyList);
    }
}
