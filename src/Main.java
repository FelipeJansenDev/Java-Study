import java.util.HashMap;

// https://neetcode.io/problems/duplicate-integer
public class Main {
    public static void main(String[] args) {
        // Define um array de inteiros contendo os números {1, 2, 3, 3}.
        int[] nums = {1, 2, 3, 3};

        // Cria um HashMap para armazenar cada número do array como chave e sua contagem como valor.
        HashMap<Integer, Integer> map = new HashMap<>();

        // Itera sobre cada número do array 'nums'.
        for (int numero : nums) {
            // Para cada número, verifica se já existe no HashMap.
            // Se existir, incrementa o valor associado à chave (contagem do número).
            // Se não existir, adiciona o número como chave com valor inicial 1.
            map.put(numero, map.getOrDefault(numero, 0) + 1);
        }

        // Usa a API de Streams para buscar a primeira entrada no HashMap
        // onde o valor (contagem) é maior que 1, ou seja, encontra o primeiro número duplicado.
        System.out.println(map.entrySet().stream().anyMatch(entry -> entry.getValue() > 1));

    }
}
