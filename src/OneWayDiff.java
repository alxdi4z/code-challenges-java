public class OneWayDiff {

    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        System.out.println(isOneAway("abcde", "abcd")); // should return true
        System.out.println(isOneAway("abde", "abcde")); // should return true
        System.out.println(isOneAway("a", "a")); // should return true
        System.out.println(isOneAway("abcdef", "abqdef")); // should return true
        System.out.println(isOneAway("abcdef", "abccef")); // should return true
        System.out.println(isOneAway("abcdef", "abcde")); // should return true
        System.out.println(isOneAway("aaa", "abc")); // should return false
        System.out.println(isOneAway("abcde", "abc")); // should return false
        System.out.println(isOneAway("abc", "abcde")); // should return false
        System.out.println(isOneAway("abc", "bcc")); // should return false
    }

    public static Boolean OneAwaySameLength(String s1, String s2) {
        int diff = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                diff++;
        }
        if (diff > 1)
            return false;
        return true;
    }

    public static Boolean OneWayDiffLength(String s1, String s2) {
        int j = 0;
        int diff = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s1.charAt(j) != s2.charAt(i)) {
                diff++;
                j++;
            }
            j++;
            if (diff > 1)
                return false;
        }

        return true;
    }

    // Implement your solution below.
    public static Boolean isOneAway(String s1, String s2) {
        if (Math.abs(s1.length() - s2.length()) >= 2)
            return false;
        if (s1.length() == s2.length()) {
            return OneAwaySameLength(s1, s2);
        } else if (s1.length() > s2.length()) {
            return OneWayDiffLength(s1, s2);
        } else {
            return OneWayDiffLength(s2, s1);
        }
    }
}
