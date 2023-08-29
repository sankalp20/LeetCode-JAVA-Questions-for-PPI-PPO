class Solution {
    public String minWindow(String s, String t) 
    {
        if(s == null || s.length() < t.length() || s.length() == 0)
        {
            return "";
        }
        Map<Character, Integer> map = new HashMap<>();
        for(char c: t.toCharArray())
        {
            if(map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
                map.put(c, 1);
        }
        // mapCounter = 0 denotes condition is satiffied and we got solution
        int mapCounter = map.size();
        int n = s.length();
        int l = 0, r = 0;  // two pointers
        int start = 0, maxLen = 0;
        for(r = 0; r < n; r++)
        {
            char curR = s.charAt(r);
            if(map.containsKey(curR))
            {
                map.put(curR, map.get(curR)-1);
                if(map.get(curR) == 0)
                    mapCounter--;
                
                // got soltion
                if(mapCounter == 0)
                {
                    // finding better solution by shifting left pointer
                    while(l < n && mapCounter == 0)
                    {
                        char curL = s.charAt(l);
                        if(map.containsKey(curL))
                        {
                            map.put(curL, map.get(curL)+1);
                            if(map.get(curL) > 0)
                                mapCounter++;
                        }
                        l++;
                    }
                    // getting best solution
                    if(maxLen > r-l+2 || maxLen == 0)
                    {
                        maxLen = (r-l) + 2;
                        start = l-1;
                    }
                }
            }
        }
        return s.substring(start, start+maxLen);
    }
}