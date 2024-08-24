package datos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

       /*
        crear un programa que pida los datos de n personas(ced, nom, ape, gen,
        sueldo), luego mostrar los datos
        */
        int n, L;
        String aux;

        do {
            do {
                aux = JOptionPane.showInputDialog("digite la cantidad de personas");
            } while (aux.isEmpty());
            n = Integer.parseInt(aux);
        } while (n < 1);

        Persona[] PER = new Persona[n];

        for (L = 0; L < PER.length; L++) {
            Persona P1 = new Persona();
            do {
                P1.setCed(JOptionPane.showInputDialog("Digite la cedula de la " + (L + 1) + " persona"));
            } while (P1.getCed().isEmpty());
            do {
                P1.setNom(JOptionPane.showInputDialog("Digite su nombre"));
            } while (P1.getNom().isEmpty());
            do {
                P1.setApe(JOptionPane.showInputDialog("Digite su apellido"));
            } while (P1.getApe().isEmpty());
            do {
                do {
                    aux = JOptionPane.showInputDialog("genero"
                            + "\n1. Masculino"
                            + "\n2. Femenino");
                } while (aux.isEmpty());
            } while (Integer.parseInt(aux) < 1 || Integer.parseInt(aux) > 2);
            if (Integer.parseInt(aux) == 1)
                P1.setGen("Masculino");
            else
                P1.setGen("Femenino");
            do {
                do {
                    aux = JOptionPane.showInputDialog("Digite su sueldo");
                } while (aux.isEmpty());
                P1.setSue(Float.parseFloat(aux));
            } while (P1.getSue() < 1300000);
            PER[L] = P1;
        }

        // detectar que no se repite la cedula


        //mostramos los datos
        for (L = 0; L < PER.length; L++)
            JOptionPane.showMessageDialog(null, PER[L].mostrar(L + 1));
    }
}