package pe.edu.isil;

public class SumaNatural {
    public static int sumar(int n){
        if(n<0){
            throw new IllegalArgumentException("N no debe ser negativo");
        }
        if(n==0){
            return 0;
        }
        return n +sumar(n-1);
    }
    public static int sumarPares(int n){
        if( n<0 ) throw new IllegalArgumentException("n no negativo");
        if(n==0){
            return 0;
        }
        if( n % 2 !=0){
            return sumarPares(n-1);
        }
        return n + sumarPares(n-2);
    }
    public static void main(String[] args){
        System.out.println("Suma del 1 al 5 es: " + sumar(5));
        System.out.println("Suma hasta 7 " + sumarPares(8));
    }
}
