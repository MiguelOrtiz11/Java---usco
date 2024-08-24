package datos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Crar un programa que pida los datos de n personas (ced, nom, ape, gen, sue) y mostrarlos

        int n, L;
        String aux;
        do{
            do{
                aux= JOptionPane.showInputDialog("Digite la cantidad de personas");
            }while(aux.isEmpty());
            n = Integer.parseInt(aux);
        }while(n<1);

        Persona [] PER = new Persona[n];
        for(L=0 ; L < PER.length ; L++){
            
        }

    }
}