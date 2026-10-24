package com.lideratec;

public class NodoYEnlaces {
    static class Nodo{
        int dato;
        Nodo next;
        Nodo(int dato){
            this.dato = dato;
            this.next = null;
        }
    }
    static class ListaSimple{
        Nodo head;

        void cargarEjemplo(){
            Nodo n1 = new Nodo(29);
            Nodo n2 = new Nodo(3);
            Nodo n3 = new Nodo(4);
            Nodo n4 = new Nodo(13);
            n1.next= n2;
            n2.next=n3;
            n3.next = n4;
            head = n1;
        }


        void recorrer(){
            Nodo actual = head;
            while( actual != null){
                System.out.println(actual.dato + " ");
                actual = actual.next;
            }
            System.out.println();
        }

        void insertarInicio(int dato){
            Nodo nuevo = new Nodo(dato);
            nuevo.next=head;
            head=nuevo;
        }

        void insertarFinal(int dato){
            Nodo nuevo = new Nodo(dato);
            if(head == null){
                head=nuevo;
                return;
            }
            Nodo actual = head;
            while(actual.next != null){
                actual = actual.next;
            }
            actual.next = nuevo;
        }

        void insertarEnPosicion(int dato, int posicion){
            if(posicion <0){
                throw new IllegalArgumentException("Posicion Invalida");
            }
            if(posicion==0){
                insertarInicio(dato);
                return;
            }
            Nodo actual = head;
            int contador = 0;
            while(actual != null && contador < posicion -1){
                actual = actual.next;
                contador++;
            }
            if(actual==null){
                throw new IllegalArgumentException("Posicion fuera rango");
            }
            Nodo nuevo = new Nodo(dato);
            nuevo.next = actual.next;
            actual.next=nuevo;
        }
    }
    public static void main(String[] args){
        ListaSimple lista = new ListaSimple();
        lista.cargarEjemplo();
        lista.recorrer();
        System.out.println("-----------------------");
        lista.insertarInicio(80);
        lista.recorrer();
        System.out.println("-----------------------");
        lista.insertarInicio(96);
        lista.recorrer();

        System.out.println("-----------------------");
        lista.insertarFinal(190);
        lista.recorrer();

        System.out.println("-----------------------");
        lista.insertarEnPosicion(15,1);
        lista.recorrer();
    }
}
