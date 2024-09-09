import java.util.ArrayList;
import java.util.List;

public class Mezclar {
    public static void main(String[] args) {
        List<Integer> lista1 = convertirLista(args[0]);
        List<Integer> lista2 = convertirLista(args[1]);

        List<Integer> resultado = merge(lista1, lista2);
        System.out.println(resultado);
    }

    public static List<Integer> convertirLista(String cadena) {
        String[] numeros = cadena.split(",\\s*");
        List<Integer> lista = new ArrayList<>();
        for (String numero : numeros) {
            lista.add(Integer.parseInt(numero));
        }
        return lista;
    }

    public static List<Integer> merge(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> resultado = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i) < lista2.get(j)) {
                resultado.add(lista1.get(i));
                i++;
            } else {
                resultado.add(lista2.get(j));
                j++;
            }
        }
        while (i < lista1.size()) {
            resultado.add(lista1.get(i));
            i++;
        }
        while (j < lista2.size()) {
            resultado.add(lista2.get(j));
            j++;
        }
        return resultado;
    }
}