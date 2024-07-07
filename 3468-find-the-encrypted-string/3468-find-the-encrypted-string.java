class Solution {
    public String getEncryptedString(String s, int k) {
        
        StringBuilder sb= new StringBuilder();
        int len=s.length();

        for(int i=0;i<len;i++){

            int replaceWith= (i+k)%len;
            sb.append(s.charAt(replaceWith));
        }
    return sb.toString();
}
}