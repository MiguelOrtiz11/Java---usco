import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear un programa que pida los datos de n personas (edad, genero, estrato)
        // al final indicar cuantas personas por cada genero, cuantas son de
        // cada estrato socieconomico, cual es la edad promedio de las mujeres

        Scanner sc = new Scanner(System.in);

        int n, p, edad, gen, est, ch, cm, e1, e2, e3, e4, e5, e6;


        do {
            System.out.println("Digite cantidad de personas");
            n = sc.nextInt();
        } while (n <= 0);

        switch (est) {
            case 1:
                e1++;
                break;
            case 2:
                e2++;
                break;
            case 2:
                e3++;
                break;
            case 2:
                e4++;
                break;
            case 2:
                e5++;
                break;
            case 2:
                e6++;
                break;
        }
        // RESULTADOS

        System.out.println("Cantidad de personas: " + n);
        System.out.println("Cantidad de hombres: " + ch);
        System.out.println("Cantidad de mujeres: " + cm);
        if(cm!=0){
            epm = emp/cm;
            System.out.println("Edad promedio de " + cm + " es: "+ epm);
        }
        System.out.println("Personas estrato 1: " + e1);
        System.out.println("Personas estrato 2: " + e2);
        System.out.println("Personas estrato 3: " + e3);
        System.out.println("Personas estrato 4: " + e4);
        System.out.println("Personas estrato 5: " + e5);
        System.out.println("Personas estrato 6: " + e6);




    }
}