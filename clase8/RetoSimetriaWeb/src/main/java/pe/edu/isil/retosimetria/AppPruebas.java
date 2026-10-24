package pe.edu.isil.retosimetria;

public class AppPruebas {

    public static void main(String[] args){
        mostrar(1221, "Anita lava la tina");
        mostrar(131, "somos");
        mostrar(37, "Java");
        mostrar(120, "Java");
    }

    private static void mostrar(int codigo, String frase){
        ValidadorReto reto = new ValidadorReto(codigo, frase);
        System.out.printf("%d / %s | capicua=%s, primo=%s, palindromo=%s | %d/3 %s%n",
                codigo,frase, reto.esCapicua(), reto.esPrimo(), reto.esPalindromo(), reto.puntaje(), reto.nivel());
    }
}
