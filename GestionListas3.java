import java.util.ArrayList;
import java.util.Scanner;

public class GestionListas3 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Cereza");
        lista.add("Durazno");

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Lista de elementos: " + lista);

            System.out.print("Introduce el índice del elemento que deseas ver (0 a " + (lista.size() - 1) + "): ");
            int indice = scanner.nextInt();

            String elemento = lista.get(indice);
            System.out.println("El elemento en el índice " + indice + " es: " + elemento);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de los límites de la lista. " +
                    "El tamaño de la lista es: " + lista.size());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            System.out.println("Gestión de lista finalizada.");
            scanner.close();
        }
    }
}

