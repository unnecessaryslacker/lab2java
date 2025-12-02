package lab2;

public class TextOperation {

    public static String removeMaxSubstring(String sentence, char start, char end) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == start) {
                if (first == -1) first = i;
                last = findLast(sentence, end, i);
            }
        }

        if (first != -1 && last != -1 && last > first) {
            return sentence.substring(0, first) + sentence.substring(last + 1);
        }

        return sentence;
    }

    private static int findLast(String s, char end, int from) {
        int pos = -1;
        for (int i = from; i < s.length(); i++) {
            if (s.charAt(i) == end) pos = i;
        }
        return pos;
    }
}
