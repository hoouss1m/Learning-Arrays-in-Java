import java.util.Scanner;

public class pair {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int[] NUM = new int[8];
    int pair = 0;
    int impair = 0;
    System.out.println("ENTER YOUR NUMBERS :");
    for (int i = 0; i < 8; i++) {
      System.out.print("NUM " + (i + 1) + " : ");
      NUM[i] = scanner.nextInt();
    }
    for (int i = 0; i < 8; i++) {
      if (NUM[i] % 2 == 0) {
        pair = pair + 1;
      } else {
        impair = impair + 1;
      }
    }
    System.out.print("PAIR: ");
    for (int i = 0; i < 8; i++) {
      if (NUM[i] % 2 == 0) {
        System.out.println("");
        System.out.print(NUM[i] + " ,");
      }
    }
    System.out.println("");
    System.out.print("IMPAIR: ");
    for (int i = 0; i < 8; i++) {
      if (NUM[i] % 2 != 0) {
        System.out.print(NUM[i] + " ,");
      }
    }
    scanner.close();
  }
}