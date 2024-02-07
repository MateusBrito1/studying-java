package study;

import java.util.HashMap;
import java.util.Map;

public class Aula19MapAndHashMap {
    public static void main(String[] args) {

        Map<String, String> nome = new HashMap<>();
        nome.put("Mateus", "Matematica");


        for (Map.Entry<String, String> entry : nome.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println("o nome é : " + key + " e a materia é :" + value);
        }

    }
}
