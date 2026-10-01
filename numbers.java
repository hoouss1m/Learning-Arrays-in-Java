public class numbers {
  public static void main(String[] args) {

    int[] numbers = { 3, 4, -2, -6, 7, -8, -1 };

    int S = 0;
    int V = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > 0) {
        S = S + 1;
      } else if (numbers[i] < 0) {
        V = V + 1;
      }
    }

    System.out.println("Positive numbers: " + S);
    System.out.println("Negative numbers: " + V);
  }
}
//
//
//
//
//
//
//
//
//
//
//
//
//
// Algorithme Diagonale_For
// Variables
// T : tableau[3,3] d'entiers
// i, j, k : entier
// Début
// k = 1
// Pour i = 1 à 3 alors
// Pour j = 1 à 3 alors
// T[i,j] = k
// k = k + 1
// FinPour
// FinPour
// Pour i = 1 à 3 alors
// Écrire(T[i,i])
// FinPour
// Fin