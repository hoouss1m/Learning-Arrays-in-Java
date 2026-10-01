public class dec2 {
    public static void main(String[] args) {
        int a = 15;
        int[] bin = new int[8];

        for (int i = 7; i >= 0; i--) {
            bin[i] = a % 2;
            a = a / 2;
        }

        for (int i = 0; i < 8; i++) {
            System.out.print(bin[i]);
        }
    }
}