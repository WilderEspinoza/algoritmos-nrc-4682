package com.lideratec;

public class DeclaracionMatrizInt {

    public static void main(String[] args){
        int[][] numeroEnteros = new int[2][3];
        System.out.println("Filas: " + numeroEnteros.length);
        System.out.println("Columnas " + numeroEnteros[0].length);
        System.out.println("Contenido inicial");

        for (int fila =0; fila < numeroEnteros.length; fila++){
            for(int columna = 0; columna <numeroEnteros[fila].length; columna++ ){

                System.out.print(numeroEnteros[fila][columna] + " ");
            }
            System.out.println();

        }

    }
}
