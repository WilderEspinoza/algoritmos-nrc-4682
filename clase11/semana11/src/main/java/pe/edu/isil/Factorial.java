package pe.edu.isil;

public class Factorial {

    public  static int factorial(int n){
        if(n== 0 || n ==1){
            return 1;
        }
        return n * factorial(n -1);
    }

    public static void main(String[] args){
        System.out.println("Factorial de 5"  + " es " + factorial(5));
        System.out.println("Factorial de 8"  + " es " + factorial(8));
        System.out.println("Factorial de 12"  + " es " + factorial(12));

    }
}
