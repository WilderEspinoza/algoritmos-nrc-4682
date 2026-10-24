package com.lideratec;

public class AccesoPosicion {

    public static void main(String[] args){
        String[][] comidas = {
                {"Avena", "Cereal", "Huevo", "Yogurt", "Fruta", "Pan tostado", "Hotcakes"},
                {"Pollo","Lentejitas", "Verduras", "Bistec", "Champiñones", "Espagueti", "Atun"},
                {"Frijoles", "Tortillas", "Estofado", "Picadiullo", "Lasaña", "KFC" , "Bembos"}
        };

        String cenaJueves = comidas[2][3];

        System.out.println("Cene jueves " + cenaJueves);
    }
}
