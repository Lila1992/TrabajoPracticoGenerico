import java.util.ArrayList;
import java.util.List;

public class Main {

    // 1. Implementación del método genérico imprimirLista(List<T> lista)
    public static <T> void imprimirLista(List<T> lista) {
        System.out.println("--- IMPRIMIENDO ELEMENTOS DE LA LISTA (" + 
            (lista.isEmpty() ? "Vacia" : lista.get(0).getClass().getSimpleName()) + ") ---");
        
        for (T elemento : lista) {
            System.out.println("Elemento: " + elemento);
        }
        System.out.println("Total de elementos: " + lista.size() + "\n");
    }

    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN DE MÉTODOS GENÉRICOS EN JAVA ===\n");

        // 2. Crear y popular lista de Enteros (List<Integer>)
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(10);
        listaEnteros.add(20);
        listaEnteros.add(30);
        listaEnteros.add(40);
        listaEnteros.add(50);

        // 3. Crear y popular lista de Cadenas (List<String>)
        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("Java");
        listaCadenas.add("Programación III");
        listaCadenas.add("Métodos Genéricos");
        listaCadenas.add("UTN Mendoza");

        // 4. Reutilizar el método genérico con diferentes tipos de datos
        imprimirLista(listaEnteros);
        imprimirLista(listaCadenas);

        // Demostración adicional: lista de un tipo de objeto personalizado
        List<Double> listaDecimales = List.of(9.5, 8.75, 10.0);
        imprimirLista(listaDecimales);
    }
}