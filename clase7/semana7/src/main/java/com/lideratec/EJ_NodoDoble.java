package com.lideratec;

public class EJ_NodoDoble {

    static class NodoDoble{
        int dato;
        NodoDoble anterior;
        NodoDoble siguiente;
        NodoDoble(int dato){
            this.dato = dato;
            this.anterior = null;
            this.siguiente = null;
        }
    }

    static class ListaDoble{
        NodoDoble inicio, ultimo;

        void insertarFinal(int dato){
            NodoDoble nuevo = new NodoDoble(dato);
            if(inicio == null){
                inicio = ultimo = nuevo;
                return;
            }
            ultimo.siguiente= nuevo;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }

        void mostrarAdelante(){
            NodoDoble actual = inicio;
            while(actual != null){
                System.out.println(actual.dato +  " ");
                actual = actual.siguiente;
            }
        }

        void mostrarAtras(){
            NodoDoble actual = ultimo;
            while(actual !=null){
                System.out.println(actual.dato + " ");
                actual = actual.anterior;
            }
        }

        boolean eliminar(int dato){
            NodoDoble actual = inicio;
            while( actual !=null && actual.dato !=dato){
                actual = actual.siguiente;
            }
            if(actual ==null) return false;

            if(actual.anterior ==null) inicio= actual.siguiente;
            else actual.anterior.siguiente = actual.siguiente;
            if(actual.siguiente == null) ultimo = actual.anterior;
            else actual.siguiente.anterior = actual.anterior;
            return true;
        }

        boolean buscar(int dato){
            NodoDoble actual = inicio;
            while( actual != null){
                if(actual.dato == dato) return true;
                actual = actual.siguiente;
            }
            return false;
        }

        boolean modificar(int antiguo, int nuevo){
            NodoDoble actual = inicio;
            while( actual != null){
                if(actual.dato == antiguo){
                    actual.dato =   nuevo;
                    return true;
                }
                actual = actual.siguiente;
            }
            return false;
        }
    }

    public static void main(String[] args){
        ListaDoble lista = new ListaDoble();
        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(30);
        lista.mostrarAdelante();
        System.out.println("------------------");
        lista.mostrarAtras();
        System.out.println("------------------");
        lista.eliminar(20);
        lista.mostrarAdelante();
        System.out.println("------------------");
        System.out.println("Existe el 10 " + lista.buscar(10));
        System.out.println("Modificado 10 por 25 " + lista.modificar(10,25));
        lista.mostrarAdelante();

    }
}
