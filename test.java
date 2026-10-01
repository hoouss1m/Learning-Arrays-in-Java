public class test {
  public static void main(String[] args) {

    int[] num = { 15, 8, 22, 5, 17, 30, 8 };

    int sum = 0;
    int min = num[0];
    int max = num[0];

    for (int i = 0; i < num.length; i++) {

      System.out.println(num[i]);

      sum += num[i];

      if (num[i] < max) {
        max = num[i];
      } else {
        min = num[i];
      }
    }

    System.out.println("Min : " + min);
    System.out.println("Max : " + max);
    System.out.println("Sum is : " + sum);

  }
}