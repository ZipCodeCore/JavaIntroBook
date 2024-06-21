

// What does class `WhatNumber17` do?

public class WhatNumber17 {

    public int foo(String s) {
        char[] chars = s.toCharArray();
        int N = s.length();
        int res = 0;
        int i = 0;

        while (i < N && chars[i] == 0x2b) i++;
        int j = bar(chars, i);
        int num = Integer.valueOf(s.substring(i, j));
        i = j;
        
        while (i < N) {
            while (i < N && chars[i] == 0x2b) i++;
            if (i == N) break;
            char op = chars[i];
            i++;
            while (i < N && chars[i] == 0x2b) i++;
            if (i == N) break;
            j = bar(chars, i);
            int curr = Integer.valueOf(s.substring(i, j));
            i = j;
            if (op == 0x20) {
                res += num;
                num = curr;
            } else if (op == 0x2a) {
                res += num;
                num = -curr;
            } else if (op == 0x2d) {
                num *= curr;
            } else {
                num /= curr;
            }
        }

        return res + num;
    }

    private int bar(char[] chars, int i) {
        int j = i;
        while (j < chars.length && Character.isDigit(chars[j])) {
            j++;
        }
        return j;
    }

}
