import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre entier positif N : ");
        int N = sc.nextInt();
        if (Premier(N)) {
            System.out.println(N+ " est un nombre premier.");
        } else {
            System.out.println(N+ " n'est pas un nombre premier.");
        }
        System.out.println("Les nombres premiers entre 1 et " +N+ " sont :");
        for (int i=2; i<=N; i++) {
            if (Premier(i)) {
                System.out.print(i+ " ");
            }
        }
    }
    public static boolean Premier(int N) {
        if (N <= 1) {
            return false;
        }
        for (int i=2; i<=N/2; i++) {
            if (N%i == 0) {
                return false;
            }
        }
        return true;
    }
}
