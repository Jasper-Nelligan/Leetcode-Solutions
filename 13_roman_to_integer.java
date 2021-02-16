class Solution {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> ROM_TO_NUM = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int total = 0, len = chars.length, char1, char2;
        for (int i = 0; i < len; i++) {
            if (i == len - 1) {
                total += ROM_TO_NUM.get(chars[i]);
                break;
            }
            char1 = ROM_TO_NUM.get(chars[i]);
            char2 = ROM_TO_NUM.get(chars[i + 1]);
            if (char1 >= char2) {
                total += char1;
            } else {
                total += char2 - char1;
                i++;
            }

        }

        return total;
    }
}
