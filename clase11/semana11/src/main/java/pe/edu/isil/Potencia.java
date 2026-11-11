package pe.edu.isil;

public class Potencia {

    public static int potencia(int a, int n){
        if( n < 0) {
            throw new IllegalArgumentException("Exponente no puede ser negativo");
        }
        if(n==0){
            return 1;
        }
        return a * potencia(a, n-1);
    }

    public static void main(String[] args){
        System.out.println("La potencia de -2 elevado a la 3 es: " + potencia(-2,3));
        System.out.println("La potencia de -2 elevado a la 4 es: " + potencia(-2,4));
        System.out.println("La potencia de -2 elevado a la 0 es: " + potencia(-2,0));

    }
}
