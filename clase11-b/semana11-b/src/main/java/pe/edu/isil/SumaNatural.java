package pe.edu.isil;

public class SumaNatural {
    public static int suma(int n){
        if(n < 0){
            throw new IllegalArgumentException("n no puede ser un numero negativo");
        }
        if(n==0){
            return 0;
        }
        return n + suma(n-1);
    }
    public static void main(String[] args){
        System.out.println("Suma de 1 al 5 es: " + suma(5));
        System.out.println("Suma de 1 al 10 es: " + suma(10));
    }
}
