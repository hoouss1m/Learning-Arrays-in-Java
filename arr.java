import java.util.Scanner;

public class arr {

  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("enter number : ");

    int a = scanner.nextInt();

    int[] tab = { 12, 15, 13, 10, 8, 9, 13, 14 };

    for (int i = 0; i < tab.length; i++) {

      if (a == tab[i]) {
        System.out.println("a exist in the array");
        System.out.println("[ " + i + " ]");
      } else {
        System.out.println("a is not exist in the array");
        break;
      }
      scanner.close();
    }
  }
}