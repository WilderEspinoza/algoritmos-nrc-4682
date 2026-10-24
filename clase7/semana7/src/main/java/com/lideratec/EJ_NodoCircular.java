package com.lideratec;

public class EJ_NodoCircular {

    static class NodoCircular{
        int dato;
        NodoCircular siguiente;

        NodoCircular(int dato){
            this.dato= dato;
            siguiente = null;
        }
    }
    static class ListaCircular{
        NodoCircular ultimo;
        void insertarFinal(int dato){
            NodoCircular nuevo =  new NodoCircular(dato);
            if(ultimo ==null){
                ultimo = nuevo;
                ultimo.siguiente = ultimo;
            }else{
                nuevo.siguiente = ultimo.siguiente;
                ultimo.siguiente = nuevo;
                ultimo = nuevo;
            }
        }
    }
    public static void main(String[] args){
        ListaCircular lista= new ListaCircular();
        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(30);
        System.out.println("Primero: " + lista.ultimo.siguiente.dato);
    }
}
