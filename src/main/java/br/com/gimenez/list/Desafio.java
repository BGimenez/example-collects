package br.com.gimenez.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desafio {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        //Add names
        names.add("Juliana");
        names.add("Pedro");
        names.add("Carlos");
        names.add("Larissa");
        names.add("João");

        //Navigate into list
        names.forEach(System.out::println);

        //Change name
        names.set(2, "Roberto");

        //Get names
        System.out.println(names.get(1));
        System.out.println(names.get(4));

        //Remove
        names.remove("João");

        //Size list
        System.out.println(names.size());

        //Verify exists in list
        System.out.println(names.contains("Juliana"));

        //Create new list and add items into old list
        List<String> newList = new ArrayList<>();
        newList.add("Ismael");
        newList.add("Rodrigo");
        names.addAll(newList);
        // --> OR
//        newList.forEach(names::add);
        // --> OR
//        for (String name : newList) {
//            names.add(name);
//        }

        //Order asc
        Collections.sort(names);

        //Verify list is empty
        System.out.println(names.isEmpty());
    }
}
