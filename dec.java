public class dec {

    static int[] binary(int a) {
        int[] bin = new int[5];

        for (int i = 4; i >= 0; i--) {
            bin[i] = a % 2;
            a = a / 2;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(bin[i]);
        }
        return bin;
    }

    public static void main(String[] args) {

        int[] bin = binary(15);
        System.out.println(bin);

    }
}
