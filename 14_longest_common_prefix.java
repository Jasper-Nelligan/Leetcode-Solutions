class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        int[][] prefixArr = new int[strs[0].length()][2];
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < prefixArr.length; i++) {
            prefixArr[i][0] = strs[0].charAt(i);
            prefixArr[i][1] = 1;
        }

        for (int i = 1; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            for (int j = 0; j < prefixArr.length && j < chars.length; j++) {
                if (chars[j] == prefixArr[j][0]) {
                    prefixArr[j][1]++;
                } else
                    break;
            }
        }

        for (int i = 0; i < prefixArr.length; i++) {
            if (prefixArr[i][1] == strs.length) {
                ans.append((char) prefixArr[i][0]);
            } else
                break;
        }

        return ans.toString();
    }
}
