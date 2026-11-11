package pe.edu.isil;

public class CasoBaseSeguro {

    public static int pasosHastaCero(int n){
        if( n < 0){
            throw new IllegalArgumentException("n debe ser no negativo");
        }

        if( n ==0){
            return 0;
        }
        return 1 + pasosHastaCero(n-1);
    }

    public static void main(String[] args){
        System.out.println("pasos desde 3: " + pasosHastaCero(3));
    }
}
