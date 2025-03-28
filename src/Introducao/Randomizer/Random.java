package Randomizer;

import java.util.ArrayList;
import java.util.Collections;

public class Random {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("item 1");
        list.add("item 2");
        list.add("item 3");
        list.add("item 4");

        Collections.shuffle(list);

        System.out.println("Lista embaralhada:" + list);
        System.out.println("NÃO SEIIIIIIIIII");
    }
}
