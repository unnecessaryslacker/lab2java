package lab2;

public class TextProcessor {

    public static String process(Object textObj, int C17, char start, char end) {
        String text = textObj.toString();

        if (C17 == 15) {
            return replaceWordsOfLength(text, 4, "REPLACED");
        }

        throw new IllegalArgumentException("C17 = " + C17 + " is not implemented yet.");
    }

    private static String replaceWordsOfLength(String text, int length, String replacement) {
        String[] words = text.split("\\b");

        StringBuilder out = new StringBuilder();

        for (String w : words) {
            if (w.matches("[A-Za-zА-Яа-яЇїІіЄєҐґ]+") && w.length() == length) {
                out.append(replacement);
            } else {
                out.append(w);
            }
        }

        return out.toString();
    }
}
