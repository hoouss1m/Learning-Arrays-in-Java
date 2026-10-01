public class tabel {
  public static void main(String[] args) {

    int[][] M = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 },
    };
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (i == j) {
          System.out.println(M[i][j]);
        }
      }
    }
  }
}