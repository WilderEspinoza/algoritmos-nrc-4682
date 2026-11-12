package pe.edu.isil;

public class Potencia {

    public static int potencia(int a, int n){
        if( n < 0){
            throw new IllegalArgumentException("El exponente no puede ser un numero negativo");
        }
        if(n==0){
            return 1;
        }
        return a * potencia(a, n-1);
    }

    public static void main(String[] args){
        System.out.println("el numro 2 elevado a 3: " + potencia(2,3));
        System.out.println("el numro 4 elevado a 3: " + potencia(4,3));

    }
}
