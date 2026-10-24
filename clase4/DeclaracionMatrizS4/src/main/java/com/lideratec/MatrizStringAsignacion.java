package com.lideratec;

public class MatrizStringAsignacion {

    public static void main(String[] args){

        String[][] nombre = new String[2][2];

        nombre[0][0] = "Arturo";
        nombre[0][1] = "Parra";

        System.out.println("Fila 0 " + nombre[0][0] + " " + nombre[0][1]);
        System.out.println("Fila 1 " + nombre[1][0] + " " + nombre[1][1]);

    }
}
