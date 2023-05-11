import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> convertMapST = new HashMap<Character, Character>();
        HashMap<Character, Character> convertMapTS = new HashMap<Character, Character>();

        for (int i = 0; i < s.length(); i++)
        {
            if (convertMapST.containsKey(s.charAt(i)))
            {
                if (convertMapST.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
            else if (convertMapTS.containsKey(t.charAt(i)))
            {
                if (convertMapTS.get(t.charAt(i)) != s.charAt(i))
                    return false;
            }
            else
            {
                convertMapST.put(s.charAt(i), t.charAt(i));
                convertMapTS.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}