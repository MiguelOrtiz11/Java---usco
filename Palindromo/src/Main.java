import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear un programa ue me indique si una palabra es palindrome, sin metdos

        Scanner sc = new Scanner(System.in);
        String cad;
        int L;
        do {
            System.out.println("Ingrese la palabra: ");
            cad = sc.nextLine();
        } while (cad.isEmpty());

        // Analizamos
        for (L = 0; L < cad.length(); L++)
            if (cad.charAt(L) != cad.charAt(cad.length() - 1 - L))
                break;

        if (L == cad.length())
            System.out.println(cad + " es palindrome");
        else
            System.out.println(cad + "No es palindrome");


    }
}
