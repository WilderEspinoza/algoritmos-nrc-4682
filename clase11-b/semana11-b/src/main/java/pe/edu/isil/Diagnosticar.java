package pe.edu.isil;

public class Diagnosticar {

    public static int pasosHastaCero(int n){
        if(n < 0){
            throw new IllegalArgumentException("n no debe ser un numero negativo");
        }
        if(n==0){
            return 0;
        }
        return 1 + pasosHastaCero(n-1);
    }

    public static void main(String[] args){
        System.out.println("Pasos desde 3 hasta 1: " +  pasosHastaCero(3));
        System.out.println("Pasos desde 10 hasta 1: " +  pasosHastaCero(10));

    }
}
