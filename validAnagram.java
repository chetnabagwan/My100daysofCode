class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alparr=new int[26];
        if (s.length()==t.length()){
        
        for(int i=0;i<s.length();i++){
            alparr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            alparr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<alparr.length;i++){
            if(alparr[i]!=0){
                return false;
            }
        }
        return true; 
        }
        else{
            return false;
        }
   public static void main(String args[]){
    String s="cat";
    String t="cab";
    isAnagram(s,t);
  
  }
}
