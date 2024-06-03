class Solution {
    public int appendCharacters(String s, String t) {
        
        int i=0,j=0,len1=s.length(),len2=t.length();
        while(i<len1 && j<len2){
            if(s.charAt(i)==t.charAt(j)){
                j++;
            }
          i++;
        }
        return len2-j;
    }
}