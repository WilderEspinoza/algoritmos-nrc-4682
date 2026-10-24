package pe.edu.isil.retosimetria;

import java.util.Locale;

public class ValidadorReto {
    private final int codigo;
    private final String frase;
    public ValidadorReto(int codigo, String frase){
        if(codigo<0 || codigo > 999999){
            throw new IllegalArgumentException("El codigo debe estar entre 0 y 999999");
        }
        if(frase==null || frase.isBlank() || frase.length() >80){
            throw new IllegalArgumentException("La frase debe contener entre 1 y 80 caracteres utiles");
        }
        this.codigo = codigo;
        this.frase = frase;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getFrase(){
        return frase;
    }

    //Validaciones
    public boolean esCapicua(){
        int restante = codigo;
        int invertido = 0;
        do{
            int digito = restante %10;
            invertido = invertido * 10 + digito;
        }while(restante>0);

        return codigo ==invertido;
    }

    public boolean esPalindromo(){
        String limpio = frase.toLowerCase(Locale.ROOT).replace(" ", "");
        for(int i = 0; i <limpio.length()/2; i++){
            if(limpio.charAt(i) != limpio.charAt(limpio.length()-1-i)){
                return false;
            }
        }
        return !limpio.isEmpty();
    }

    public boolean esPrimo(){
        if(codigo < 2) return false;
        int limite = (int) Math.sqrt(codigo);
        for(int divisor = 2 ; divisor <= limite; divisor ++){
            if(codigo % divisor ==0) return false;
        }
        return  true;
    }

    public int puntaje(){
        int puntos = 0;
        if(esCapicua()) puntos++;
        if(esPalindromo()) puntos++;
        if(esPrimo()) puntos ++;
        return puntos;
    }

    public String nivel(){
        return switch (puntaje()){
            case 3 -> "Experto";
            case 2 -> "Avanzado";
            case 1 -> "Inicial";
            default -> "Aun sin puntos";
        };
    }

}
