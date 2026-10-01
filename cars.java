
public class cars {

    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        System.out.println(cars[0]);
    }
}



/* String[] cars = new String[4]; // size is 4
 * cars[0] = "Volvo";
 * cars[1] = "BMW";
 * cars[2] = "Ford";
 * cars[3] = "Mazda";
 * System.out.println(cars[0]);
 */

// when the first valeu changing(cars[0])
public static void main(String[] args) {
    String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
    cars[0] = "Opel";
    System.out.println(cars[0]);
}
