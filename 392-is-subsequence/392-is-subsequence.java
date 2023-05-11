class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        int sPointer = 0;

        if (sArr.length == 0)
            return true;
        if (tArr.length == 0)
            return false;
        for (int tPointer = 0; tPointer < tArr.length; tPointer++)
        {
            if (sArr[sPointer] == tArr[tPointer]) {
                sPointer++;
            }

            if (sPointer == sArr.length)
                return true;
        }

        return false;
    }
}