import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //crea un programa que indique la siguiente serie de datos, donde al usuario
        //se le pregunta cuantos numeros quiere generar
        //ejemplo, numeros a generar 6
        //1, 1, 3, 5, 25, 75
        //ejemplo 2, numeros a generar 10
        //1, 1, 3, 5, 25, 75, 77, 5929, 17787, 17789

        Scanner Leer = new Scanner(System.in);
        int n, L, num;
        do {
            System.out.println("Digite la cantidad de numeros a generar");
            n = Leer.nextInt();
        } while (n < 1);
        for (L = 1, num = 1; L <= n; L++) {
            System.out.println(num);
            if (L % 3 == 1)
                num = (int) Math.pow(num, 2);
            else if (L % 3 == 2)
                num = num * 3;
            else
                num = num + 2;
        }
    }
}