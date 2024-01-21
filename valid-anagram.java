class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];

        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<t.length(); i++){
            if(arr[t.charAt(i) - 'a'] == 0){
                return false;
            } else {
                arr[t.charAt(i) - 'a']--;
            }
        }

        for(int i=0; i<26; i++){
            if(arr[i] != 0)
                return false;
        }
        return true;
    }
}
