import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un entier n : ");
        int n = sc.nextInt();
        long factWhile = withWhile(n);
        long factFor = withFor(n);
        System.out.println("n! calculé avec while : " +factWhile);
        System.out.println("n! calculé avec for : " +factFor);
    }

    public static long withWhile(int n) {
        long result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }
    public static long withFor(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
