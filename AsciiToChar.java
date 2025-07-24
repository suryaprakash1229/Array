public class AsciiToChar {
    public static void main(String[] args) {
        int[] asciiValues = {72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33};

        for (int value : asciiValues) {
            System.out.print((char) value);
        }
        System.out.println();
    }
}
