package br.com.gimenez.queue;

import java.util.*;

public class Desafio {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();

        //Add names
        names.add("Juliana");
        names.add("Pedro");
        names.add("Carlos");
        names.add("Larissa");
        names.add("João");

        //Navigate into list
        names.forEach(System.out::println);

        //Return first name without remove
        System.out.println(names.peek());

        //Return first name with remove
        System.out.println(names.poll());

        //Add new name and verify position in queue
        names.add("Daniel");
        System.out.println(names);

        //Size list
        System.out.println(names.size());

        //Verify list is empty
        System.out.println(names.isEmpty());

        //Verify name Carlos in list
        System.out.println(names.contains("Carlos"));
    }
}
