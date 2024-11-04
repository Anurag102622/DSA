class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character,Integer> mp = new HashMap<>();
        int max=0;
        int left=0;

        for(int right =0;right<s.length();right++){
            char currentChar = s.charAt(right);
            if(mp.containsKey(currentChar)){
                left = Math.max(left,mp.get(currentChar)+1);    
            }
            mp.put(currentChar,right);
            max = Math.max(max,right-left+1);

            }
            return max;
        }
        
    }
