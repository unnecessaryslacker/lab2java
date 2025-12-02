package lab2;

public class TextFactory {

    public static Object create(String text, int C3) {
        return switch (C3) {
            case 0 -> new StringBuilder(text);
            case 1 -> text;
            case 2 -> new StringBuffer(text);
            default -> text;
        };
    }
}
