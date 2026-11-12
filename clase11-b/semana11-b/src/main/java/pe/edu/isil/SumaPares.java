package pe.edu.isil;

public class SumaPares {

    public static int sumaPares(int n){
        if(n< 0  || n % 2 != 0){
            throw new IllegalArgumentException( "El numero n no puede ser negativa o impar");
        }
        if( n==0){
            return 0;
        }
        return n + sumaPares(n-2);
    }

    public static void main(String[] args){
        System.out.println("Suma de pares hasta el 9: " + sumaPares(9));
    }
}
