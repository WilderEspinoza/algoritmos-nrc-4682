package com.lideratec;

import java.util.Arrays;

public class VectorDemo {

    public static void main(String[] args){

        System.out.println(" ====== ARREGLOS UNIDIMENSIONALES CON MI QUERIDO PROFESOR ====== ");

        ejemploCrearyRepresentar();
        ejemploAccederyModificar();
        EjemploRecorrerYLlenar();
        EjemploBuscar();
        EjemploAgregarYEliminar();
    }


    public static void ejemploCrearyRepresentar(){

        System.out.println(" ------------------ EJEMPLO 1 : CREAR Y REPRESENTAR");

        int[] notas = {15, 18 , 12 ,11};
        System.out.println("Vector: " + Arrays.toString(notas));
        System.out.println("Tamaño: " + notas.length);


        for( int i= 0; i < notas.length;i++){
            System.out.println("Indice: " + i + " -> " + notas[i]);
        }

        System.out.println("Ultimo indice valido: " + (notas.length -1));
    }

    public static void ejemploAccederyModificar(){
        System.out.println(" ------------------ EJEMPLO 2 : ACCEDER Y MODIFICAR");

        int[] notas = {15, 18 , 12 ,11};

        System.out.println("Valor en la nota 1: " + notas[1]);

        notas[1]=19;
        System.out.println("Vector: " + Arrays.toString(notas));
        System.out.println("Tamaño: " + notas.length);


    }

    public static void EjemploRecorrerYLlenar(){
        System.out.println(" ------------------ EJEMPLO 3 : RECORRER Y LLENAR");

        int[] notas = {15, 18 , 12 ,11};

        for( int i= 0; i < notas.length;i++){
            System.out.println("Indice: " + i + " -> " + notas[i]);
        }

        int[] edades = new int[5];

        for (int i = 0; i <edades.length; i++){
            edades[i] =  18 + i;
        }

        System.out.println("Edades: " + Arrays.toString(edades));
    }

    public static void EjemploBuscar(){
        System.out.println(" ------------------ EJEMPLO 4 : BUSCAR");

        int[] notas = {15, 18 , 12 ,11};
        int buscado = 18;
        int posicion = -1;

        for( int i = 0; i<notas.length; i++){
            if(notas[i] == buscado){
                posicion = i;
                break;
            }
        }

        if(posicion != -1){
            System.out.println("Encontrandoel indice " + posicion);
        }else{
            System.out.println("No encontrado");
        }
    }

    public static void EjemploAgregarYEliminar(){
        System.out.println(" ------------------ EJEMPLO 4 : AGREGAR Y ELIMINAR");

        int[] datos = new int[5];
        datos[0] = 10;
        datos[1] = 20;
        datos[2] = 30;

        int usados = 3;

        System.out.println("Inicial: ");
        mostrarSoloUsados(datos, usados);

        if(usados < datos.length){
            datos[usados] = 40;
            usados++;
        }

        System.out.println("Despues de agregar 40: ");
        mostrarSoloUsados(datos, usados);


        //Eliminar el elemento del indice 1

        int indiceEliminar = 1;
        if(indiceEliminar >=0 && indiceEliminar < usados){
            for(int i =indiceEliminar; i<usados -1; i++){
                datos[i] = datos[i+1];
            }

            datos[usados-1] = 0;
            usados--;
        }
        System.out.println("Despues de eliminar indice 1 ");

        mostrarSoloUsados(datos, usados);

    }

    public static void mostrarSoloUsados(int[] dato, int usados){
        for (int i=0; i< usados; i++){
            System.out.println(dato[i]);
            System.out.println(", ");
        }
    }
}
