package pe.edu.isil;

public class SumaDigitos {
    public static int sumarDigitos(int n){
        if( n < 0){
            throw new IllegalArgumentException("n no puede ser negativo");
        }
        if(n==0){
            return 0;
        }

        int ultimo = n %10;
        int restante = n/10;

        return ultimo + sumarDigitos(restante);
    }

    public static void main(String[] args){
        System.out.println("Suma de 123 " + sumarDigitos(123));
    }
}
