package pe.edu.isil.retosimetria;

public class HtmlSeguro {

    public static String escapar(String valor){
        if(valor==null) return "";
        return valor.replace("&","&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&#39;");
    }
}
