class Solution {
    public int lengthOfLongestSubstring(String s) {
       // int [] count=new int [26];
        HashSet<Character> map=new HashSet<>();
        char [] ch=s.toCharArray();
        int n=s.length();
        int ans=0,j=0;
        for(int i=0;i<n;++i){
            //int temp=s.charAt(i)-'a';
           // char c=s.charAt(i);
            if(map.contains(ch[i])){
                ans=Math.max(ans,i-j);
                while(map.contains(ch[i])){
                    map.remove(ch[j]);
                    j++;
                }
             //   map.add(s.charAt(i));
            }
            
                map.add(ch[i]);
            
        }
        ans=Math.max(ans,n-j);
        return ans;
    }
}