package pe.edu.isil;

public class ListaPush {
    static class Nodo{
        int dato;
        Nodo siguiente;
        Nodo(int dato){
            this.dato = dato;
            this.siguiente = null;
        }
    }
    static class PilaLista{
        private Nodo tope;
        public PilaLista(){
            tope = null;
        }
        public void push(int dato){
            Nodo nuevo =new Nodo(dato);
            nuevo.siguiente = tope;
            tope = nuevo;
            System.out.println(" Nodo apilado " + dato);
        }
        public void mostrar(){
            Nodo actual =tope;
            System.out.println("Tope a base: " );
            while(actual != null){
                System.out.println(actual.dato + " ") ;
                actual= actual.siguiente;
            }
        }
        public int pop(){
            if(tope == null){
                System.out.println("Error: Pila esta vacia ");
                return -1;
            }
            int dato = tope.dato;
            tope = tope.siguiente;
            return dato;
        }
    }
    public static void main(String[] args){
        PilaLista pila = new PilaLista();
        pila.push(10);
        pila.push(30);
        pila.push(14);
        pila.mostrar();
        System.out.println("--------------");
        System.out.println("Nodo retirado " + pila.pop());
        pila.mostrar();

    }
}
