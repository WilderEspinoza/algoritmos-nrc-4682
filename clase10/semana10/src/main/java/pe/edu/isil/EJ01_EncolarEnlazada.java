package pe.edu.isil;

public class EJ01_EncolarEnlazada {

    static class Nodo{
        int dato;
        Nodo siguiente;

        Nodo(int dato){
            this.dato = dato;
            this.siguiente = null;
        }
    }

    static class ColaLista{
        Nodo front, rear;
        void encolar(int dato){
            Nodo nuevo = new Nodo(dato);
            if(rear == null){
                front = nuevo;
                rear = nuevo;
            }else{
                rear.siguiente = nuevo;
                rear = nuevo;
            }
            System.out.println("Encolado " + dato);
        }

        void mostrar(){
            Nodo actual = front;
            System.out.println("cola: ");
            while( actual !=  null){
                System.out.println(actual.dato + " ");
                actual = actual.siguiente;
            }
            System.out.println();
        }

        int desencolar(){
            if(front ==null){
                System.out.println("Error: Cola esta vacia");
                return -1;
            }
            int dato = front.dato;
            front = front.siguiente;
            if(front == null){
                rear = null;
            }
            return dato;
        }
    }

    public static void main(String[] args){
        ColaLista  cola = new ColaLista();
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        cola.mostrar();
        System.out.println("---------------------------");
        System.out.println("se va " +  cola.desencolar());
        System.out.println("se va " +  cola.desencolar());
        System.out.println("se va " +  cola.desencolar());
        System.out.println("se va " +  cola.desencolar());
        cola.mostrar();
        cola.encolar(70);
        cola.encolar(80);
        cola.mostrar();


    }
}
