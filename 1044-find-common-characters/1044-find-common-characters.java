class Solution {
    public List<String> commonChars(String[] words) {
        
        List<String> ans= new ArrayList<>();
        int[] freq=new int[26];
        int len=words[0].length();

        for(int i=0;i<len;i++) {
            int ch=words[0].charAt(i)-97;
            freq[ch]++;
        }

        for(int i=1;i<words.length;i++){

            int[] tempFreq=new int[26];
            len=words[i].length();
            for(int j=0;j<len;j++){
                int ch=words[i].charAt(j)-97;
                tempFreq[ch]++;
            }
            for(int j=0;j<26;j++){
                freq[j]=Math.min(freq[j],tempFreq[j]);
            }
        }

        for(int i=0;i<26;i++){
            int c=freq[i];
            while(c>0){
                char ch=(char)(i+97);
                ans.add(String.valueOf(ch));
                c--;
            }
        }
        return ans;
    }
}