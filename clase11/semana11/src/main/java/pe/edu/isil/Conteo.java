package pe.edu.isil;

public class Conteo {

    public static void contar(int n){
        if( n <= 0){
            return;
        }
        System.out.println(n);
        contar(n-1);
    }
    public static void contarRegresivoPares(int n){
        if( n <= 0){
            return;
        }
        if( n % 2==0){
            System.out.println(n);
        }
        contarRegresivoPares(n-1);
    }
    public static void contarRegresivoInPares(int n){
        if( n <= 0){
            return;
        }
        if( n % 2!=0){
            System.out.println(n);
        }
        contarRegresivoInPares(n-1);
    }
    public static void main(String[] args){
        contarRegresivoInPares(10);
    }
}
