class Solution {
    public String frequencySort(String str) {
        int[] ar=new int[123];
        for (int i=0; i<str.length(); i++){
            ar[(int)str.charAt(i)]++;
        }
        StringBuilder sb=new StringBuilder();
        while (true){
            int max=0;
            for (int i=0; i<123; i++){
                if (ar[i]>ar[max]) max=i;
            }
            char c=(char) max;
            for (int i=1; i<=ar[max]; i++){
                sb.append(c);
            }
            ar[max]=0;
            if (sb.length()==str.length()){
                return sb.toString();
            }
        }
    }
}
