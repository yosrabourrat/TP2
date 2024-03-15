import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nombre de lignes du triangle : ");
        int N = sc.nextInt();
        triangle(N);
    }

    public static void triangle(int N) {
        for (int i=1; i<= N; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
