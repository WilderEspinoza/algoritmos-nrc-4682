package pe.edu.isil;

public class EJ01_EncolarVector {


    static class Cola{
        int[] cola;
        int front, rear, capacidad;

        Cola(int capacidad){
            this.capacidad = capacidad;
            cola = new int[capacidad];
            front = -1;
            rear = -1;
        }

        void encolar(int dato){
            if(rear == capacidad -1 ){
                System.out.println("Error: Cola esta llena");
                return;
            }
            if(front == -1){
                front = 0;
            }
            cola[++rear] = dato;
            System.out.println("Encolado " + dato);
        }

        int desencolar(){
            if(front == -1 || front > rear){
                System.out.println("Error: Cola esta vacia");
                return -1;
            }
            int dato = cola[front++];
            if(front > rear){
                front = -1;
                rear = -1;
            }
            return dato;
        }
    }
    public static void main(String[] args){
        Cola cola = new Cola(3);
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        System.out.println("front " + cola.front + " rear " + cola.rear);
        System.out.println("-------------------");
        System.out.println("Se va " + cola.desencolar());
        System.out.println("Se va " + cola.desencolar());
        System.out.println("Se va " + cola.desencolar());
        System.out.println("cola vacia " + cola.desencolar());
        cola.encolar(60);
        cola.encolar(70);


    }
}
