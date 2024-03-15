import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nombre N : ");
        int N = sc.nextInt();
        double somme = serie(N);
        System.out.println("La somme des " +N+ " premiers termes de la série harmonique est : " +somme);
    }

    public static double serie(int N) {
        double somme = 0.0;
        for (int i=1; i<=N; i++) {
            somme += 1.0 / i;
        }
        return somme;
    }
}
