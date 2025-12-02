package lab2;

public class Main {
    public static void main(String[] args) {
        try {
            int zal = 3517;
            int C3 = zal % 3;
            int C17 = zal % 17;

            System.out.println("C3 = " + C3);
            System.out.println("C17 = " + C17);

            String text = "Alpha ZxxxA is here. Hello world! Amazing Zebra is Coming? AtestZ wow.";

            Object textObj = TextFactory.create(text, C3);

            String processed = TextProcessor.process(textObj, C17, 'A', 'Z');

            System.out.println("\nOriginal:");
            System.out.println(text);

            System.out.println("\nProcessed:");
            System.out.println(processed);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
