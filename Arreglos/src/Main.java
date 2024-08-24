import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /*
        crear un arreglo de n posiciones para almacenar los sueldos de los
        empleados, donde ninguno gana menos que el minimo ni mas de 20 salarios
        minimos, luego indicar el sueldo promedio, el sueldo mayor y el sueldo
        menor y el nombre de la persona que gana el mayor y menor sueldo
        */
        Scanner Leer = new Scanner(System.in);
        int n, p, pmay, pmen;
        String aux;
        float smay, smen, sp;
        do {
            do {
                System.out.println("Digite la cantidad de empleados");
                aux = Leer.nextLine();
            } while (aux.isEmpty());
            n = Integer.parseInt(aux);
        } while (n < 1);
        float[] sue = new float[n];
        String[] nom = new String[n];
        //creamos el ciclo para pedir los sueldos
        for (p = 0; p < sue.length; p++) {
            do {
                System.out.println("Digite el nombre del " + (p + 1) + " empleado");
                nom[p] = Leer.nextLine();
            } while (nom[p].isEmpty());
            do {
                do {
                    System.out.println("Digite el sueldo del " + (p + 1) + " empleado");
                    aux = Leer.nextLine();
                } while (aux.isEmpty());
                sue[p] = Float.parseFloat(aux);
            } while (sue[p] < 1300000 || sue[p] > 26000000);
        }
        //recorremos el arreglo y mostramos los sueldos, sacamos el promedio
        //el mayor y el menor
        System.out.println("los sueldos son");
        for (p = pmay = pmen = 0, smay = sp = 0, smen = 26000000; p < sue.length; p++) {
            System.out.println("sueldo de " + nom[p] + ": " + sue[p]);
            sp = sp + sue[p];
            if (sue[p] > smay) {
                smay = sue[p];
                pmay = p;
            }
            if (sue[p] < smen) {
                smen = sue[p];
                pmen = p;
            }
        }
        //mostramos el resto de cosas
        sp /= n;
        System.out.println("El sueldo promedio es: " + sp);
        System.out.println("el sueldo menor es: " + smen + " y lo gana: " + nom[pmen]);
        System.out.println("el sueldo mayor es: " + smay + " y lo gana: " + nom[pmay]);

    }
}