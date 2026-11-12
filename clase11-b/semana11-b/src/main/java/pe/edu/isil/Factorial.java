package pe.edu.isil;

public class Factorial {

    public static int factorial(int n){
        if (n == 1 || n == 0) {
            return 1;
        }
        return n *  factorial(n-1);
    }

    public static void main(String[] args){
        System.out.println("Factorial de 5 es " + factorial(5));
        System.out.println("Factorial de 10 es " + factorial(10));
    }
}
