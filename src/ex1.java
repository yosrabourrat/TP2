import java.util.Scanner;
public class ex1 {

    public static void Result(int sum, int product, double moyenne) {
        System.out.println("Somme : " +sum);
        System.out.println("Produit : " +product);
        System.out.println("Moyenne : " +moyenne);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nombre N : ");
        int N = sc.nextInt();
        int sum = 0;
        int product = 1;
        double moyenne = 0;

        // Utilisation de while
        System.out.println("\nUtilisation de while :");
        int i = 0;
        while (i < N) {
            System.out.print("Entrez un nombre entier : ");
            int number = sc.nextInt();
            sum += number;
            product *= number;
            moyenne += number;
            i++;
        }
        moyenne /= N;
        Result(sum, product, moyenne);

        sum = 0;
        product = 1;
        moyenne = 0;
        i = 0;

        // Utilisation de do-while
        System.out.println("\nUtilisation de do-while :");
        do {
            System.out.print("Entrez un nombre entier : ");
            int number = sc.nextInt();
            sum += number;
            product *= number;
            moyenne += number;
            i++;
        } while (i < N);
        moyenne /= N;
        Result(sum, product, moyenne);

        sum = 0;
        product = 1;
        moyenne = 0;

        // Utilisation de for
        System.out.println("\nUtilisation de for :");
        for (int j = 0; j < N; j++) {
            System.out.print("Entrez un nombre entier : ");
            int number = sc.nextInt();
            sum += number;
            product *= number;
            moyenne += number;
        }
        moyenne /= N;
        Result(sum, product, moyenne);
    }
}
