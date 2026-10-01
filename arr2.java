import java.util.Scanner;

class arr2 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number: ");
    int a = scanner.nextInt();

    int[] tab = { 12, 15, 13, 10, 8, 9, 13, 14 };
    boolean found = false;
    for (int i = 0; i < tab.length; i++) {
      if (a == tab[i]) {
        found = true;
        System.out.println("[ " + i + " ]");
        break;
      }

    }

    if (found) {
      System.out.println("a exists in the array");

    } else {
      System.out.println("a does not exist in the array");
    }

    scanner.close();
  }
}