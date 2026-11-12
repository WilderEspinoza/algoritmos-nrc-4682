package pe.edu.isil;

public class Conteo {

    public static void contar(int n){
        if(n < 0){
            return;
        }
        System.out.println(n);
        contar(n-1);
    }

    public static void main(String[] args){
        contar(10);
    }
}
