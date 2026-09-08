import java.util.Arrays;

public class VectoresDemo {

    public static void main(String[] args) {
        System.out.println("=== ARREGLOS UNIDIMENSIONALES - VECTORES ===");

        ejemplo1CrearYRepresentar();
        ejemplo2AccederYModificar();
        ejemplo3RecorrerYLlenar();
        ejemplo4Buscar();
        ejemplo5AgregarYEliminar();
        ejemplo6Ordenar();
        ejemplo7Integrador();
    }

    public static void ejemplo1CrearYRepresentar() {
        System.out.println("\n--- EJEMPLO 1: CREAR Y REPRESENTAR ---");

        int[] notas = {15, 18, 12, 20};

        System.out.println("Vector: " + Arrays.toString(notas));
        System.out.println("Tamaño: " + notas.length);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Índice " + i + " -> " + notas[i]);
        }

        System.out.println("Último índice válido: " + (notas.length - 1));
    }

    public static void ejemplo2AccederYModificar() {
        System.out.println("\n--- EJEMPLO 2: ACCEDER Y MODIFICAR ---");

        int[] notas = {15, 18, 12, 20};

        System.out.println("Valor en notas[1]: " + notas[1]);

        notas[1] = 19;

        System.out.println("Vector modificado: " + Arrays.toString(notas));
        System.out.println("El tamaño sigue siendo: " + notas.length);

        // Error controlado para explicar en clase:
        // System.out.println(notas[4]);
        // En un arreglo de tamaño 4, los índices válidos van de 0 a 3.
    }

    public static void ejemplo3RecorrerYLlenar() {
        System.out.println("\n--- EJEMPLO 3: RECORRER Y LLENAR ---");

        int[] notas = {15, 18, 12, 20};

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Índice " + i + ": " + notas[i]);
        }

        int[] edades = new int[5];

        for (int i = 0; i < edades.length; i++) {
            edades[i] = 18 + i;
        }

        System.out.println("Edades: " + Arrays.toString(edades));
    }

    public static void ejemplo4Buscar() {
        System.out.println("\n--- EJEMPLO 4: BUSCAR ---");

        int[] notas = {15, 18, 12, 20};
        int buscado = 12;
        int posicion = -1;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == buscado) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("Encontrado en índice: " + posicion);
        } else {
            System.out.println("No encontrado");
        }

        // Modificación sugerida:
        // cambia buscado a 25 y predice el resultado.
    }

    public static void ejemplo5AgregarYEliminar() {
        System.out.println("\n--- EJEMPLO 5: AGREGAR Y ELIMINAR ---");

        int[] datos = new int[5];

        datos[0] = 10;
        datos[1] = 20;
        datos[2] = 30;

        int usados = 3;

        System.out.print("Inicial: ");
        mostrarSoloUsados(datos, usados);

        // Agregar al final lógico.
        if (usados < datos.length) {
            datos[usados] = 40;
            usados++;
        }

        System.out.print("Después de agregar 40: ");
        mostrarSoloUsados(datos, usados);

        // Eliminar el elemento del índice 1.
        int indiceEliminar = 1;

        if (indiceEliminar >= 0 && indiceEliminar < usados) {
            for (int i = indiceEliminar; i < usados - 1; i++) {
                datos[i] = datos[i + 1];
            }

            datos[usados - 1] = 0;
            usados--;
        }

        System.out.print("Después de eliminar índice 1: ");
        mostrarSoloUsados(datos, usados);

        System.out.println("Capacidad física: " + datos.length);
        System.out.println("Elementos lógicamente usados: " + usados);
    }

    public static void ejemplo6Ordenar() {
        System.out.println("\n--- EJEMPLO 6: ORDENAR ---");

        int[] notas = {18, 12, 20, 15};

        System.out.println("Antes: " + Arrays.toString(notas));

        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = 0; j < notas.length - 1 - i; j++) {
                if (notas[j] > notas[j + 1]) {
                    int temporal = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = temporal;
                }
            }
        }

        System.out.println("Después: " + Arrays.toString(notas));
    }

    public static void ejemplo7Integrador() {
        System.out.println("\n--- EJEMPLO 7: INTEGRADOR ---");

        int[] notas = {14, 18, 11, 16, 20};

        System.out.println("Inicial: " + Arrays.toString(notas));
        System.out.println("Tamaño: " + notas.length);

        for (int i = 0; i < notas.length; i++) {
            System.out.println(i + " -> " + notas[i]);
        }

        notas[2] = 13;

        int buscado = 16;
        int posicion = -1;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == buscado) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("La nota 16 está en índice: " + posicion);
        }

        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = 0; j < notas.length - 1 - i; j++) {
                if (notas[j] > notas[j + 1]) {
                    int temporal = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = temporal;
                }
            }
        }

        System.out.println("Resultado final: " + Arrays.toString(notas));
    }

    public static void mostrarSoloUsados(int[] datos, int usados) {
        System.out.print("[");

        for (int i = 0; i < usados; i++) {
            System.out.print(datos[i]);

            if (i < usados - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
