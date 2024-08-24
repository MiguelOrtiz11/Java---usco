import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nd, num, L, nbase;

        do {
            System.out.println("Ingresa numero decimal: ");
            nd = sc.nextInt();
        } while (nd <= 0);

        do {
            System.out.println("Ingresa base de 2 a 9: ");
            nbase = sc.nextInt();
        } while (nbase < 1 || nbase > 9);
        
    }
}