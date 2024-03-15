import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la base X : ");
        int X = sc.nextInt();
        System.out.print("Entrez l'exposant N : ");
        int N = sc.nextInt();
        if (N < 0) {
            System.out.println("L'exposant doit être un entier positif ou nul.");
        } else {
            long resultat = Puissance(X, N);
            System.out.println(X+ "^" +N+ " = " +resultat);
        }
    }
    public static long Puissance(int X, int N) {
        long resultat = 1;
        for (int i=0; i<N; i++) {
            resultat *= X;
        }
        return resultat;
    }
}
