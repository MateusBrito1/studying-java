package study;

import java.util.HashMap;
import java.util.Map;

public class Aula21HashMapNovamente {
    public static void main(String[] args) {

        Map<String, Integer> pacientes = new HashMap<>();
        pacientes.put("Mariana", 23);
        pacientes.put("Mateus", 22);
        pacientes.put("Beggy", 4);

        for (Map.Entry<String, Integer> entry : pacientes.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("O paciente: " + key);
            System.out.println("Idade: " + value);
        }

    }
}
